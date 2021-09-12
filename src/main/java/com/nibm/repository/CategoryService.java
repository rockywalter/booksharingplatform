package com.nibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nibm.model.Category;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo catrepo;

	public List<Category> findAll() {

		return catrepo.findAll();
	}

	public Optional<Category> getcategory(Category category) {

		return catrepo.findById(category.getCategoryID());

	}

	public Category addOrUpdateCategory(Category category) {

		return catrepo.save(category);

	}

	public void deletecatweb(int id) {
		
		catrepo.deleteById(id);
	}

	public Optional<Category> getcategoryweb(int id) {
		// TODO Auto-generated method stub
		return catrepo.findById(id);
	}

}
