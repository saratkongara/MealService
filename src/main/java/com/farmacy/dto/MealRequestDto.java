package com.farmacy.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import javax.validation.Valid;
import java.util.List;

@Valid
@Builder
@Getter
public class MealRequestDto {
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

    private List<Long> tagIds;

    @Override
    public String toString() {
        return "MealRequestDto{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", nutritionDetails='" + nutritionDetails + '\'' +
                ", cookingTimeInMinutes=" + cookingTimeInMinutes +
                ", active=" + active +
                ", tagIds=" + tagIds +
                '}';
    }
}
