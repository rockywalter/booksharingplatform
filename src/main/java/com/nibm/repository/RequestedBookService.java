package com.nibm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibm.model.RequestedBook;

@Service
public class RequestedBookService {

	@Autowired
	RequestedBookRepo reqbookrepo;

	public List<RequestedBook> getAllReqBooks() {
		return reqbookrepo.findAll();

	}

	public RequestedBook addReqBook(RequestedBook reqbook) {

		return reqbookrepo.save(reqbook);

	}

	public void deleteReqBook(RequestedBook reqbook) {

		reqbookrepo.deleteById(reqbook.getRequested_id());

	}

	public void deletereqbookid(int id) {
		reqbookrepo.deleteById(id);

	}

	public Optional<RequestedBook> getReqBook(int id) {
		
		return reqbookrepo.findById(id);
	}

}
