package com.example.login.loginassignment.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.login.loginassignment.model.User;
import com.example.login.loginassignment.repository.UserRepository;


@Service
public class ServiceImpl implements Serviceinterface {
	
	@Autowired
	private UserRepository repository; 
	
	 User k;

	public String saveUser(User user) {
		
		Optional<User> u=repository.findById(user.getUname());
		if(u.isPresent())
		{
			
			return "uname already exists";
		       
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
		
		
	}

	public User getUser(String usn, String psw) {
		
		
		
      Optional<User> u= repository.findById(usn);
		
		if(u.isPresent())
		{
			 k= u.get();
			 if(k.getPassword().equals(psw))
					return k;
			 else
					return null;
			
		}
		return null;
		
	}
		

		
		
	}


