package com.example.login.loginassignment.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;

import com.example.login.loginassignment.model.Data;
import com.example.login.loginassignment.model.Response;
import com.example.login.loginassignment.model.User;
import com.example.login.loginassignment.repository.UserRepository;

@Service
public class serviceimpl {
	
	
	
	@Autowired
	private UserRepository repository; 
	
	@Autowired
    Response response;
	
	
	
	public User getUser(@RequestHeader String uname, @RequestHeader String psw)
	{
		
		
	 Data d= repository.findByUserName(uname);
		for(User u:d.getUdata())
		{
	  if(u.getUname().equals(uname))
		{
			if(u.getPassword().equals(psw))
			{
				response.setLogin(true);
				return null;
				//return repository.findById(usn);	
				
			}
		}
		
		//return repository.findById(usn);
		
		
	/*	
		Optional<User> u=repository.findById(usn);
		
		return u;
		*/
		}
			
		return null;
	}
	

}
