package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer> {

}
