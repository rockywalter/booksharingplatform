package com.nibm.repository;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nibm.model.Listing_book;
import com.nibm.model.User;

@Service
public class Listing_bookService {

	@Autowired
	Listing_bookRepo bookRepo;

	public List<Listing_book> findAllBooks() {

		List<Listing_book> bookads = bookRepo.findAll();

		for (Listing_book book : bookads) {

			byte[] fileContent = null;
			try {
				fileContent = FileUtils.readFileToByteArray(new File(book.getImage()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String encodedString = Base64.getEncoder().encodeToString(fileContent);

			book.setImage(encodedString);

		}

		return bookads;
	}

	public void saveorUpdate(Listing_book book) {

		String encodeimage = book.getImage();

		byte[] decodedBytes = Base64.getDecoder().decode(encodeimage);
		try {
			FileUtils.writeByteArrayToFile(new File("bookimages/" + String.valueOf(book.getListing_book_id()) + "_image.png"), decodedBytes);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		book.setImage("bookimages/" + String.valueOf(book.getListing_book_id()) + "_image.png");
		bookRepo.save(book);

	}

	public void deleteAllBooks() {
		bookRepo.deleteAll();

	}

	public Optional<Listing_book> findById(Listing_book book) {

		return bookRepo.findById(book.getListing_book_id());

	}

	public List<Listing_book> findByLocation(Listing_book book) {

		return bookRepo.findByDistrict(book.getDistrict());

	}

	public List<Listing_book> findBycategory(Listing_book book) {

		return bookRepo.findByCategoryid(book.getCategoryid());
	}

	public void deleteBook(Listing_book book) {

		bookRepo.deleteById(book.getListing_book_id());

	}

}
