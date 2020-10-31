package com.farmacy.service;

import com.farmacy.dto.MealRequestDto;
import com.farmacy.entity.Meal;
import com.farmacy.entity.Tag;
import com.farmacy.repository.MealsRepository;
import com.farmacy.repository.TagsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MealsService {

    @Autowired
    MealsRepository mealsRepository;

    @Autowired
    TagsRepository tagsRepository;

    public List<Meal> getMeals(){
        return mealsRepository.findAll();
    }

    public Meal saveMeal(MealRequestDto mealRequestDto){
        System.out.println(mealRequestDto.toString());
        // Create a Meal
        Meal meal = Meal.builder().active(mealRequestDto.getActive())
                .description(mealRequestDto.getDescription())
                .cookingTimeInMinutes(mealRequestDto.getCookingTimeInMinutes())
                .tags(new HashSet<>())
                .title(mealRequestDto.getTitle()).build();

        // Create two tags
        for (Long tagId: mealRequestDto.getTagIds()) {
            Optional<Tag> optionalTag = tagsRepository.findById(tagId);
            optionalTag.ifPresent(tag -> {
                meal.getTags().add(tag);
//                tag.getMeals().add(meal);
            });
        }

        return mealsRepository.save(meal);
    }
}
