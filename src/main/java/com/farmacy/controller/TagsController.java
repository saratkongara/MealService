package com.farmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmacy.entity.Tag;
import com.farmacy.repository.TagsRepository;

@RestController
public class TagsController {
	@Autowired
	TagsRepository repository;
	
	@GetMapping(path="/tags")
	public List<Tag> list() {
		List<Tag> allTags = repository.findAll();
		return allTags;
	}
	
	@PostMapping(path="/tags")
	public Tag create(@RequestBody Tag tag) {
		Tag savedTag = repository.save(tag);
		return savedTag;
	}
}
