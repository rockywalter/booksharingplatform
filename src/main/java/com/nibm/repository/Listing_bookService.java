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

	private static int x=0;

	
	@Autowired
	Listing_bookRepo bookRepo;

	public List<Listing_book> findAllBooks() {

		List<Listing_book> bookads = bookRepo.findAll();

		for (Listing_book book : bookads) {

			if (book.getE_book_file() != null) {
				byte[] pdfdecodedBytes = null;
				try {
					pdfdecodedBytes = FileUtils.readFileToByteArray(new File("src/main/resources/static/"+book.getE_book_file()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String encodedString = Base64.getEncoder().encodeToString(pdfdecodedBytes);
				book.setE_book_file(encodedString);
			}

			if (book.getImage() != null)
			{
				byte[] fileContent = null;

				try {
					fileContent = FileUtils.readFileToByteArray(new File("src/main/resources/static/"+book.getImage()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String encodedString = Base64.getEncoder().encodeToString(fileContent);

				book.setImage(encodedString);
				
			}
			

		}

		return bookads;
	}

	public void saveorUpdate(Listing_book book) {
		
   int y=x++;
		
		if (book.getE_book_file() != null) {
			byte[] pdfdecodedBytes = Base64.getDecoder().decode(book.getE_book_file());
			try {
				FileUtils.writeByteArrayToFile(
						new File("src/main/resources/static/ebooks/" + String.valueOf(y) + "_ebook.pdf"),
						pdfdecodedBytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			book.setE_book_file( "ebooks/"+String.valueOf(y) + "_ebook.pdf");
		}

		if (book.getImage() != null) {
			
			byte[] decodedBytes = Base64.getDecoder().decode(book.getImage());

			try {
				FileUtils.writeByteArrayToFile(
						new File("src/main/resources/static/bookimages/" + String.valueOf(y) + "_image.png"), decodedBytes);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			book.setImage("bookimages/"+String.valueOf(y) + "_image.png");
		}

		bookRepo.save(book);

	}

	public void deleteAllBooks() {
		bookRepo.deleteAll();

	}

	public Optional<Listing_book> findById(Listing_book book) {

		return bookRepo.findById(book.getListing_book_id());

	}

	public List<Listing_book> findByLocation(Listing_book book) {

		List<Listing_book> bookads=bookRepo.findByDistrict(book.getDistrict());
		
		for (Listing_book book1 : bookads) {

			if (book1.getE_book_file() != null) {
				byte[] pdfdecodedBytes = null;
				try {
					pdfdecodedBytes = FileUtils.readFileToByteArray(new File(book1.getE_book_file()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String encodedString = Base64.getEncoder().encodeToString(pdfdecodedBytes);
				book1.setE_book_file(encodedString);
			}

			byte[] fileContent = null;

			try {
				fileContent = FileUtils.readFileToByteArray(new File(book1.getImage()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String encodedString = Base64.getEncoder().encodeToString(fileContent);

			book1.setImage(encodedString);

		}

		return bookads;

	}

	public List<Listing_book> findBycategory(Listing_book book) {

		//return bookRepo.findByCategoryid(book.getCategoryid());
		List<Listing_book> bookads=bookRepo.findByCategoryid(book.getCategoryid());
		
		for (Listing_book book1 : bookads) {

			if (book1.getE_book_file() != null) {
				byte[] pdfdecodedBytes = null;
				try {
					pdfdecodedBytes = FileUtils.readFileToByteArray(new File("src/main/resources/static/"+book1.getE_book_file()));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String encodedString = Base64.getEncoder().encodeToString(pdfdecodedBytes);
				book1.setE_book_file(encodedString);
			}

			byte[] fileContent = null;

			try {
				fileContent = FileUtils.readFileToByteArray(new File("src/main/resources/static/"+book1.getImage()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String encodedString = Base64.getEncoder().encodeToString(fileContent);

			book1.setImage(encodedString);

		}

		return bookads;
	}

	public void deleteBook(Listing_book book) {

		bookRepo.deleteById(book.getListing_book_id());

	}

	public List<Listing_book> findAllBooksForWeb() {
		
		return bookRepo.findAll();
	
	}

	public Optional<Listing_book> findBookByIdWeb(int id) {
		
		return bookRepo.findById(id);
	}

	public void deletebookweb(int id) {
		
		bookRepo.deleteById(id);
	
		
	}

	public void updateforweb(Listing_book book) {
		
		Optional<Listing_book> book1 = bookRepo.findById(book.getListing_book_id());
		
		book.setUser_id(book1.get().getUser_id());
		
		bookRepo.save(book);
		
	}

}
