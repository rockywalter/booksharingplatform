package com.nibm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nibm.model.User;
import com.nibm.repository.UserService;
import com.sun.mail.iap.Response;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userservice.findAll();
	}

	@GetMapping(path = "/user/{email}")
	public User getUser(@PathVariable String email) {
		return userservice.findByEmail(email);
	}

	@PostMapping(path = "/user")
	public void addUser(@RequestBody User user) {

		userservice.addOrUpdateUser(user);

	}

	@PostMapping(path = "/user/verify")
	public ResponseEntity<Object> userVerify(@RequestBody User user) {

		User return_user= userservice.userVerify(user);
		if(return_user==null)
		{
			return new ResponseEntity<Object>("Login Fail!",HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Object>(return_user,HttpStatus.OK);

	}

	@GetMapping(path = "user/frogetpassword/{email}")
	public String passwordReset(@PathVariable String email) {
		return userservice.resetPassword(email);

	}
	@GetMapping(path = "user/checkresetcode/{code}")
	public String checkResetCode(@PathVariable String code) {
		return userservice.resetPassword(code);

	}

}
