package com.farmacy.service;

import com.farmacy.entity.Tag;
import com.farmacy.repository.TagsRepository;
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
public class TagsServiceTest {

    @Mock
    TagsRepository tagsRepository;

    @InjectMocks
    TagsService tagsService;

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
        Assert.assertEquals(tagsService.getTags().get(0).getTitle(), "Shubham");
    }

    @Test
    public void saveTag() {
        Assert.assertEquals(tagsService.saveTag(Tag.builder().title("Shubham").build()).getTitle(), "Shubham");
    }
}