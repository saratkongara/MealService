package com.farmacy.service;

import com.farmacy.entity.Meal;
import com.farmacy.entity.Tag;
import com.farmacy.repository.MealsRepository;
import com.farmacy.repository.TagsRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MealsServiceTest {

    @Mock
    MealsRepository mealsRepository;

    @InjectMocks
    MealsService mealsService;

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        Meal meal = Meal.builder().title("Shubham").active(true).cookingTimeInMinutes(10).description("Test Meal").build();
        List<Meal> mealsList = List.of(meal);
        when(mealsRepository.findAll()).thenReturn(mealsList);

        when(mealsRepository.save(meal)).thenReturn(meal);
    }

    @Test
    public void getMeals() {
        Assert.assertEquals(mealsService.getMeals().get(0).getTitle(), "Shubham");
    }

    @Test
    public void saveMeals() {
//        Assert.assertEquals(mealsService.saveMeal(Meal.builder().title("Shubham").active(true).cookingTimeInMinutes(10).description("Test Meal").build()).getTitle(), "Shubham");
    }
}
