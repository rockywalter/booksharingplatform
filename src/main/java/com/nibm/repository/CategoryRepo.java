package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer> {

}
