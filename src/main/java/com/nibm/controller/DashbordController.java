package com.nibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashbordController {

	@RequestMapping("dashbord")
	public ModelAndView dashbord() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("dashbord");
		return mv;

	}

}
