package com.nibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nibm.model.Category;
import com.nibm.repository.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService catservice;

	@GetMapping("/allcategory")
	public List<Category> getAllCat() {
		return catservice.findAll();

	}

	@GetMapping("/category")
	public Optional<Category> findById(@RequestBody Category category) {
		return catservice.getcategory(category);

	}

	@PostMapping("/category")
	public Category addCategory(@RequestBody Category category) {
		return catservice.addOrUpdateCategory(category);

	}

}
