package com.nibm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.nibm.model.Category;
import com.nibm.model.Listing_book;
import com.nibm.repository.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService catservice;

	@PostMapping("/allcategory")
	public ResponseEntity<Object> getAllCat() {

		Map<String, List<Category>> category = new HashMap<>();
		category.put("categorylist", catservice.findAll());
		return new ResponseEntity<Object>(category, HttpStatus.OK);

	}

	@PostMapping("/getcategory")
	public Optional<Category> findById(@RequestBody Category category) {
		 
	return catservice.getcategory(category);

	}

	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category) {
		return catservice.addOrUpdateCategory(category);

	}

	@RequestMapping("webcategories")
	public ModelAndView webcategories()
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("categorylist",catservice.findAll());	
		mv.setViewName("categories");
		return mv;
		
	}
	
	@RequestMapping("deletecatweb")
	public ModelAndView deletecatweb(int id)
	{
		catservice.deletecatweb(id);
		ModelAndView mv =new ModelAndView();
		mv.addObject("categorylist",catservice.findAll());	
		mv.setViewName("categories");
		return mv;
		
	}
	
	@RequestMapping("updatecatweb")
	public ModelAndView updatecatweb(Category cat1)
	{
		catservice.addOrUpdateCategory(cat1);
		ModelAndView mv =new ModelAndView();
		mv.addObject("categorylist",catservice.findAll());	
		mv.setViewName("categories");
		return mv;
		
	}
	
	@RequestMapping("updatecatform")
	public ModelAndView updatecatform(int id)
	{
		
		ModelAndView mv =new ModelAndView();
		mv.addObject("categorylist",catservice.getcategoryweb(id));	
		mv.setViewName("updatecategoryform");
		return mv;
		
	}
	
}
