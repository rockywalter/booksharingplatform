package com.nibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibm.model.Listing_book;
import com.nibm.model.User;

@Service
public class Listing_bookService {

	@Autowired
	Listing_bookRepo bookRepo;

	public List<Listing_book> findAllBooks() {

		return bookRepo.findAll();

	}

	public void saveorUpdate(Listing_book book) {

		bookRepo.save(book);

	}

	public void deleteAllBooks() {
		bookRepo.deleteAll();

	}

	public Optional<Listing_book> findById(Listing_book book) {

		return bookRepo.findById(book.getListing_book_id());

	}

	public List<Listing_book> findByLocation(Listing_book book) {

		return bookRepo.findByDistrict(book.getDistrict());

	}

	public List<Listing_book> findBycategory(Listing_book book) {

		return bookRepo.findByCategoryid(book.getCategoryid());
	}

	public void deleteBook(Listing_book book) {

		bookRepo.deleteById(book.getListing_book_id());

	}

}
