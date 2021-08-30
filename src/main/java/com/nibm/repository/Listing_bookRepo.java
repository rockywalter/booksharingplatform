package com.nibm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Listing_book;

@Repository
public interface Listing_bookRepo extends JpaRepository<Listing_book, Integer> {

}
