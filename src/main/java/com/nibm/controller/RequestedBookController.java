package com.nibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nibm.model.RequestedBook;
import com.nibm.repository.RequestedBookService;

@RestController
public class RequestedBookController {
	
	@Autowired
	RequestedBookService reqbookservice;
	
	@GetMapping("/reqbooks")
	public  List<RequestedBook> getAllReqBooks() {	
		return reqbookservice.getAllReqBooks();	
	}
	
	@PostMapping("/reqbook")
	public RequestedBook addReqBook(@RequestBody RequestedBook reqbook) {	
		return reqbookservice.addReqBook(reqbook);	
	}

}
