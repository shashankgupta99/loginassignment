package com.example.login.loginassignment.Service;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.login.loginassignment.model.User;

public interface Serviceinterface {
	
	String saveUser(@RequestBody User user);
	
	User getUser(@RequestHeader String usn, @RequestHeader String psw);

}
