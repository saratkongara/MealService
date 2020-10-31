package com.farmacy.service;

import com.farmacy.entity.Tag;
import com.farmacy.repository.TagsRepository;
import org.hibernate.service.spi.InjectService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TagServiceTest {

    @Mock
    TagsRepository tagsRepository;

    @InjectMocks
    TagService tagService;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        Tag tag = Tag.builder().title("Shubham").build();
        List<Tag> tagsList = List.of(tag);
        when(tagsRepository.findAll()).thenReturn(tagsList);

        when(tagsRepository.save(tag)).thenReturn(tag);
    }

    @After
    public void after() {

    }

    @Test
    public void getTags() {
        Assert.assertEquals(tagService.getTags().get(0).getTitle(), "Shubham");
    }

    @Test
    public void saveTag() {
        Assert.assertEquals(tagService.saveTag(Tag.builder().title("Shubham").build()).getTitle(), "Shubham");
    }
}