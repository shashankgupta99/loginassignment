package com.example.login.loginassignment.resourse;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.login.loginassignment.Service.serviceimpl;
import com.example.login.loginassignment.model.Data;
import com.example.login.loginassignment.model.Response;
import com.example.login.loginassignment.model.User;
import com.example.login.loginassignment.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository repository; 
	
	@Autowired
    Response response;
	
	@Autowired
	serviceimpl service;
	
	/*@PostMapping("/addUser")
	public String saveUser(@RequestBody User user)
	{
		Optional<User> u=repository.findById(user.getUname());
		if(u.isPresent())
		{
			
			return "uname already exists";
		       //System.out.print(u);
		}
		else
		{
			 if(user.getPassword().equals(user.getPassword2()))
				{
				repository.save(user);
				return "user saved";

				}
				else
				return "re-enter the same password";
		}
		
	}*/
	
	@PostMapping("/getUser")
	public Response res(@RequestHeader String uname, @RequestHeader String psw)
	{
		if(service.getUser(uname, psw)==null)
			{
			return response;
			}
		return null;

	}
	
}
