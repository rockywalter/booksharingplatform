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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.nibm.model.Complain;
import com.nibm.model.User;
import com.nibm.repository.ComplainService;
import com.nibm.repository.UserService;
import com.sun.mail.iap.Response;

import netscape.javascript.JSObject;

@RestController
public class UserController {

	@Autowired
	UserService userservice;
	@Autowired
	ComplainService complainservice;

	@GetMapping(path = "/users")
	public List<User> getUsers() {
		return userservice.findAll();
	}

	@GetMapping(path = "/user")
	public User getUser(@RequestBody User user) {
		return userservice.findByEmail(user);
	}

	@PostMapping(path = "/user")
	public User addUser(@RequestBody User user) {

		return userservice.addOrUpdateUser(user);
		
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

	@PostMapping(path = "user/checkresetcode")
	public ResponseEntity<Object> checkResetCode(@RequestBody User user) {
		JSONObject jobj = new JSONObject();

		if (userservice.checkResetCode(user).equals("success")) {
			jobj.put("authentication", "success");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.OK);
		} else {
			jobj.put("authentication", "denied");
			return new ResponseEntity<Object>(jobj.toString(), HttpStatus.NOT_FOUND);
		}

	}
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv =new ModelAndView();
		mv.setViewName("login");
	
		return mv;
		
	}
	
	@RequestMapping("login")
	public ModelAndView login(String username,String password)
	{
		ModelAndView mv =new ModelAndView();
		if(username.equals("admin")&&password.equals("123") )
		{
			List<Complain> complain=complainservice.findAll();
			mv.addObject("complaincount",complain.size());
			mv.setViewName("dashbord");
			return mv;
		}
		else
		{
			mv.setViewName("login");
			mv.addObject("error","Invalid username or password");	
			return mv;
		}
		
	
		
	}
	
	@RequestMapping("webusers")
	public ModelAndView allusers()
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("userlist",userservice.findAll());	
		mv.setViewName("user");
		return mv;
		
	}
	
	@RequestMapping("deleteuserweb")
	public ModelAndView deleteuser(int id)
	{
		ModelAndView mv =new ModelAndView();
		userservice.deleteuser(id);	
		mv.addObject("userlist",userservice.findAll());	
		mv.setViewName("user");
		return mv;
		
	}
	
	@RequestMapping("updateuserweb")
	public ModelAndView deleteuser(User user)
	{
		ModelAndView mv =new ModelAndView();
		userservice.updateuserweb(user);
		mv.addObject("userlist",userservice.findAll());	
		mv.setViewName("user");
		return mv;
		
	}
	
	@RequestMapping("updateuserform")
	public ModelAndView updateuserform(int id)
	{
		ModelAndView mv =new ModelAndView();
		mv.addObject("userlist",userservice.findById(id));	
		mv.setViewName("updateuserform");
		return mv;
		
	}
	
	@RequestMapping("toprate")
	public ModelAndView toprate(int id)
	{
		User user=new User();
		Optional<User> u1 = userservice.findById(id);
		user.setEmail(u1.get().getEmail());
		user.setName(u1.get().getName());
		user.setPassword(u1.get().getPassword());
		user.setTp(u1.get().getTp());
		user.setUser_rate(u1.get().getUser_rate());
		user.setUser_id(id);
		user.setTopratedstatus("yes");
		ModelAndView mv =new ModelAndView();
		userservice.updateuserweb(user);
		mv.addObject("userlist",userservice.findAll());	
		mv.setViewName("user");
		return mv;
		
	}

}
