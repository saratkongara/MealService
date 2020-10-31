package com.farmacy.service;

import com.farmacy.entity.Tag;
import com.farmacy.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsService {
    @Autowired
    TagsRepository tagsRepository;

    public List<Tag> getTags(){
        return tagsRepository.findAll();
    }

    public Tag saveTag(Tag tag){
        return tagsRepository.save(tag);
    }
}
