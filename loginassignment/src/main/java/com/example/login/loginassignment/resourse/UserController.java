package com.example.login.loginassignment.resourse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.loginassignment.Service.ServiceImpl;

import com.example.login.loginassignment.model.User;

@RestController
public class UserController {
	
	User k;
	
	@Autowired
	ServiceImpl service;

	
	@PostMapping("/addUser")
	public String saveUser(@RequestBody User user)
	{
		return service.saveUser(user);
		
	}
	
	@PostMapping("/getUser")
	public User getUser(@RequestHeader String usn, @RequestHeader String psw)
	{
		return service.getUser(usn, psw);
		
	}
		

	}
	

