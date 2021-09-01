package com.nibm.controller;

import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.nibm.model.User;
import com.nibm.repository.UserService;
import com.sun.mail.iap.Response;

import netscape.javascript.JSObject;

@RestController
public class UserController {

	@Autowired
	UserService userservice;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userservice.findAll();
	}

	@GetMapping(path = "/user")
	public User getUser(@RequestBody User user) {
		return userservice.findByEmail(user);
	}

	@PostMapping(path = "/user")
	public void addUser(@RequestBody User user) {

		userservice.addOrUpdateUser(user);

	}

	@PostMapping(path = "/user/verify")
	public ResponseEntity<Object> userLoginVerify(@RequestBody User user) {

		User return_user = userservice.userVerify(user);

		if (return_user == null) {
			JSONObject jobj = new JSONObject();
			jobj.put("authentication", "Fail");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Object>(return_user, HttpStatus.OK);
		}

	}

	@PostMapping(path = "user/frogetpassword")
	public ResponseEntity<Object> passwordReset(@RequestBody User user) {
		String msg = userservice.resetPassword(user);
		JSONObject jobj = new JSONObject();
		if (!msg.equals("success")) {

			jobj.put("authentication", "User not in system");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.NOT_FOUND);
		} else {
			jobj.put("authentication", "Code is sent to the email");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.OK);

		}

	}

	@GetMapping(path = "user/checkresetcode/{code}")
	public ResponseEntity<Object> checkResetCode(@PathVariable String code) {
		JSONObject jobj = new JSONObject();

		if (userservice.checkResetCode(code).equals("success")) {
			jobj.put("authentication", "success");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.OK);
		} else {
			jobj.put("authentication", "denied");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.NOT_FOUND);
		}

	}

}
