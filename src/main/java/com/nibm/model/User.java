package com.nibm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue
	int user_id;
	String email;
	String password;
	String tp;
	double user_rate;
	String payment_email;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTp() {
		return tp;
	}

	public void setTp(String tp) {
		this.tp = tp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getUser_rate() {
		return user_rate;
	}

	public void setUser_rate(double user_rate) {
		this.user_rate = user_rate;
	}

	public String getPayment_email() {
		return payment_email;
	}

	public void setPayment_email(String payment_email) {
		this.payment_email = payment_email;
	}

}
