package com.farmacy.controller;

import java.util.List;

import com.farmacy.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.farmacy.entity.Tag;

import javax.validation.Valid;

@RestController
public class TagsController {
	@Autowired
	TagsService tagsService;
	
	@GetMapping(path="/tags")
	public List<Tag> list() {
		return tagsService.getTags();
	}
	
	@PostMapping(path="/tags")
	public Tag create(@Valid @RequestBody Tag tag) {
		return tagsService.saveTag(tag);
	}
}
