package com.farmacy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacy.entity.Tag;
import org.springframework.stereotype.Repository;

@Repository
public interface TagsRepository extends JpaRepository<Tag, Long> {

}