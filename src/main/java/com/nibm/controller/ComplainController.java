package com.nibm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ComplainController {

	
	@RequestMapping("webcomplains")
	public ModelAndView webcomplains()
	{
		ModelAndView mv =new ModelAndView();
		//mv.addObject("userlist",userservice.findAll());	
		mv.setViewName("complains");
		return mv;
		
	}
	
}
