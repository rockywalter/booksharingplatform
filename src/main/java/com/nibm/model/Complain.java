package com.nibm.model;

import javax.persistence.Entity;

@Entity
public class Complain {
int Complain_id;
String Complain_category;
String Comment;
int User_id;
public int getComplain_id() {
	return Complain_id;
}
public void setComplain_id(int complain_id) {
	Complain_id = complain_id;
}
public String getComplain_category() {
	return Complain_category;
}
public void setComplain_category(String complain_category) {
	Complain_category = complain_category;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public int getUser_id() {
	return User_id;
}
public void setUser_id(int user_id) {
	User_id = user_id;
}

}
