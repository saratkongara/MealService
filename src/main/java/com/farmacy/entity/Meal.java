package com.farmacy.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Meal {
	@Id
	@GeneratedValue
	private Long id;
	
	@NonNull
	private String title;
	
	@NonNull
	private String description;
	
	private String ingredients;
	
	private String nutritionDetails;
	
	@NonNull
	private Integer cookingTimeInMinutes;
	
	@NonNull
	private Boolean active;
	
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
    
    @ManyToMany(mappedBy = "meals")
	List<Tag> tags = new ArrayList<Tag>();
}
