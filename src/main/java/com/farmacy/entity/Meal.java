package com.farmacy.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Meal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
