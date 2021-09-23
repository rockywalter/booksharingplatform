package com.nibm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nibm.model.Complain;
import com.nibm.model.Listing_book;
import com.nibm.repository.ComplainService;
import com.nibm.repository.Listing_bookService;

@Controller
public class DashbordController {
	
	@Autowired
	ComplainService complainservice;
	@Autowired
	Listing_bookService bookservice;

	@RequestMapping("dashbord")
	public ModelAndView dashbord() {
		ModelAndView mv = new ModelAndView();
	    List<Complain> complain=complainservice.findAll();
//	    List<Listing_book> bookcount=bookservice.findAllBooks();
//	    mv.addObject("bookcount",bookcount.size());
		mv.addObject("complaincount",complain.size());
		mv.setViewName("dashbord");
		return mv;

	}

}
