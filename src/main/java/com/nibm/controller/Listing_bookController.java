package com.nibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nibm.model.Listing_book;
import com.nibm.model.User;
import com.nibm.repository.Listing_bookService;

@RestController
public class Listing_bookController {

	@Autowired
	Listing_bookService bookService;

	@GetMapping("/books")
	public List<Listing_book> getAllBooks() {
		return bookService.findAllBooks();

	}

	@PostMapping("/book")
	public void addOrUpdateBook(@RequestBody Listing_book book) {
		bookService.saveorUpdate(book);

	}

	@DeleteMapping("/books")
	public void deleteAllBooks() {
		bookService.deleteAllBooks();

	}

	@DeleteMapping("/book")
	public void deleteBook(@RequestBody Listing_book book) {
		bookService.deleteBook(book);

	}

	@GetMapping("/book")
	public Optional<Listing_book> findById(@RequestBody Listing_book book) {
		return bookService.findById(book);

	}

	@GetMapping("/bookslocation")
	public List<Listing_book> findByLocation(@RequestBody Listing_book book) {
		return bookService.findByLocation(book);

	}

	@GetMapping("/bookscategory")
	public List<Listing_book> findBycategory(@RequestBody Listing_book book) {
		return bookService.findBycategory(book);

	}

}
