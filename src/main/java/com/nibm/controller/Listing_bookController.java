package com.nibm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nibm.model.Listing_book;
import com.nibm.model.User;
import com.nibm.repository.Listing_bookService;

@RestController
public class Listing_bookController {

	@Autowired
	Listing_bookService bookService;

	@PostMapping("/booklist")
	public ResponseEntity<Object> getAllBooks() {
		Map<String, List<Listing_book>> listingbook = new HashMap<>();
		listingbook.put("booklist", bookService.findAllBooks());
		return new ResponseEntity<Object>(listingbook, HttpStatus.OK);

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

	@PostMapping("/bookslocation")
	public ResponseEntity<Object> findByLocation(@RequestBody Listing_book book) {
		//return bookService.findByLocation(book);
		
		Map<String, List<Listing_book>> listingbook = new HashMap<>();
		listingbook.put("booklist", bookService.findByLocation(book));
		return new ResponseEntity<Object>(listingbook, HttpStatus.OK);

	}

	@PostMapping("/bookscategory")
	public ResponseEntity<Object> findBycategory(@RequestBody Listing_book book) {
		//return bookService.findBycategory(book);

		Map<String, List<Listing_book>> listingbook = new HashMap<>();
		listingbook.put("booklist", bookService.findBycategory(book));
		return new ResponseEntity<Object>(listingbook, HttpStatus.OK);
	}
	
	@RequestMapping("booksadd")
	public ModelAndView booksadd()
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("booklist",bookService.findAllBooksForWeb());	
		mv.setViewName("booksadd");
		return mv;
		
	}
	
	@RequestMapping("/updateaddbookform")
	public ModelAndView getBooksForWeb(int id)
	{
	
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("booklist",bookService.findBookByIdWeb(id));	
		mv.setViewName("updateaddbookform");
		return mv;
		
	}
	
	@RequestMapping("/deletebookweb")
	public ModelAndView deletebookweb(int id)
	{
	
		bookService.deletebookweb(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("booklist",bookService.findAllBooksForWeb());	
		mv.setViewName("booksadd");
		return mv;
		
	}
	
	@RequestMapping("/updatebookweb")
	public ModelAndView updatebookweb(Listing_book book)
	{
		bookService.updateforweb(book);
		ModelAndView mv =new ModelAndView();
		mv.addObject("booklist",bookService.findAllBooksForWeb());	
		mv.setViewName("booksadd");
		return mv;
		
	}

}
