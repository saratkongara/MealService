package com.farmacy.service;

import com.farmacy.entity.Meal;
import com.farmacy.repository.MealsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MealsService {

    @Autowired
    MealsRepository mealsRepository;

    public List<Meal> getMeals(){
        return mealsRepository.findAll();
    }

    public Meal saveMeal(Meal meal){
        return mealsRepository.save(meal);
    }
}
