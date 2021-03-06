package com.nibm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.nibm.model.RequestedBook;
import com.nibm.repository.RequestedBookService;

@RestController
public class RequestedBookController {
	
	@Autowired
	RequestedBookService reqbookservice;
	
	@PostMapping("/reqbooks")
	public  ResponseEntity<Object> getAllReqBooks() {	
		Map<String, List<RequestedBook>> reqbook = new HashMap<>();
		reqbook.put("reqbooklist", reqbookservice.getAllReqBooks());
		return new ResponseEntity<Object>(reqbook, HttpStatus.OK);
	}
	
	@PostMapping("/reqbook")
	public RequestedBook addReqBook(@RequestBody RequestedBook reqbook) {	
		return reqbookservice.addReqBook(reqbook);	
	}
	
	@DeleteMapping("/reqbook")
	public void deleteReqBook(@RequestBody RequestedBook reqbook)
	{
		reqbookservice.deleteReqBook(reqbook);
	}
	
	@RequestMapping("webreqbooks")
	public ModelAndView webreqbooks()
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("reqbooklist",reqbookservice.getAllReqBooks());	
		mv.setViewName("requestedbook");
		return mv;
		
	}
	
	@RequestMapping("deletereqbook")
	public ModelAndView deletereqbook(int id)
	{
		reqbookservice.deletereqbookid(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("reqbooklist",reqbookservice.getAllReqBooks());	
		mv.setViewName("requestedbook");
		return mv;
		
	}
	
	@RequestMapping("updatereqbookform")
	public ModelAndView hallupdateform(int id)
	{
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("reqbooklist",reqbookservice.getReqBook(id));	
		mv.setViewName("updaterequestedbook");
		return mv;
		
	}
	
	@RequestMapping("updatereqbookweb")
	public ModelAndView updatereqbookweb(RequestedBook reqbook)
	{
		reqbookservice.addReqBook(reqbook);
		ModelAndView mv =new ModelAndView();
		mv.addObject("reqbooklist",reqbookservice.getAllReqBooks());	
		mv.setViewName("requestedbook");
		return mv;
		
	}

}
