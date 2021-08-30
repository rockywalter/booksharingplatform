package com.nibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue
	int reviewID;
	int userID;
	int listingBookID;
	String reviewType;
	String comment;
	public int getReviewID() {
		return reviewID;
	}
	public void setReviewID(int reviewID) {
		this.reviewID = reviewID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getListingBookID() {
		return listingBookID;
	}
	public void setListingBookID(int listingBookID) {
		this.listingBookID = listingBookID;
	}
	public String getReviewType() {
		return reviewType;
	}
	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	

}
