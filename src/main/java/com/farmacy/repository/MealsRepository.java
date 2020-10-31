package com.farmacy.repository;

import com.farmacy.entity.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealsRepository extends JpaRepository<Meal, Long> {

}
