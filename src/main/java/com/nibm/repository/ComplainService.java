package com.nibm.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibm.model.Complain;

@Service
public class ComplainService {

	@Autowired
	ComplainRepo complainrepo;

	public List<Complain> findAll() {
		
		return complainrepo.findAll();
		
	}

	public Complain addOrUpdateComplain(Complain complain) {
		
		return complainrepo.save(complain);
		
		 
	}

	public void deleteComplain(int id) {
		
		complainrepo.deleteById(id);
		
	}

	
	
	
	
	
	
}
