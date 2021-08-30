package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.SubCategory;

@Repository
public interface SubCategoryRepo extends JpaRepository<SubCategory, Integer> {

}
