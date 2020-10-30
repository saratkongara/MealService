package com.farmacy.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Tag {
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String title;
	
	@ManyToMany(mappedBy = "tags")
	List<Meal> meals = new ArrayList<Meal>();
}
