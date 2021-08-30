package com.nibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Listing_book {

	@Id
	@GeneratedValue
	int Listing_book_id;
	String ISBN;
	String Book_name;
	String Description;
	String Author;
	String Image;
	String Listing_type;
	String Published_year;
	String E_book_file;
	int Quantity;
	double Price;
	int User_id;
	int categoryid;
	int locationid;

	
	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getLocationid() {
		return locationid;
	}

	public void setLocationid(int locationid) {
		this.locationid = locationid;
	}

	public int getListing_book_id() {
		return Listing_book_id;
	}

	public void setListing_book_id(int listing_book_id) {
		Listing_book_id = listing_book_id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public String getListing_type() {
		return Listing_type;
	}

	public void setListing_type(String listing_type) {
		Listing_type = listing_type;
	}

	public String getPublished_year() {
		return Published_year;
	}

	public void setPublished_year(String published_year) {
		Published_year = published_year;
	}

	public String getE_book_file() {
		return E_book_file;
	}

	public void setE_book_file(String e_book_file) {
		E_book_file = e_book_file;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	public int getUser_id() {
		return User_id;
	}

	public void setUser_id(int user_id) {
		User_id = user_id;
	}


}