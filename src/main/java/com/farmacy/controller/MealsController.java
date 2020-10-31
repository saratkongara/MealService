package com.farmacy.controller;

import com.farmacy.dto.MealRequestDto;
import com.farmacy.entity.Meal;
import com.farmacy.service.MealsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MealsController {

    @Autowired
    MealsService mealsService;

    @GetMapping("/meals")
    public List<Meal> list() {
        return mealsService.getMeals();
    }

    @PostMapping(path="/meals")
    public Meal create(@Valid @RequestBody MealRequestDto mealRequestDto) {
        return mealsService.saveMeal(mealRequestDto);
    }
}
