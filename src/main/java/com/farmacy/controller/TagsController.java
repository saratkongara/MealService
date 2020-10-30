package com.farmacy.controller;

import java.util.List;

import com.farmacy.service.TagService;
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
	TagService tagService;
	
	@GetMapping(path="/tags")
	public List<Tag> list() {
		return tagService.getTags();
	}
	
	@PostMapping(path="/tags")
	public Tag create(@RequestBody Tag tag) {
		return tagService.saveTag(tag);
	}
}
