package com.nibm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nibm.model.Listing_book;
import com.nibm.model.User;

@Repository
public interface Listing_bookRepo extends JpaRepository<Listing_book, Integer> {

	List<Listing_book> findByDistrict(String id);

	List<Listing_book> findByCategoryid(int categoryid);

}
