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
	String name;
	String password;
	String tp;
	double user_rate;
	String payment_email;
	String resetcode;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResetcode() {
		return resetcode;
	}

	public void setResetcode(String resetcode) {
		this.resetcode = resetcode;
	}

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
