package com.nibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Complain {

	@Id
	@GeneratedValue
	int complain_id;
	String complain_category;
	String comment;
	int user_id;
	public int getComplain_id() {
		return complain_id;
	}
	public void setComplain_id(int complain_id) {
		this.complain_id = complain_id;
	}
	public String getComplain_category() {
		return complain_category;
	}
	public void setComplain_category(String complain_category) {
		this.complain_category = complain_category;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	

}
