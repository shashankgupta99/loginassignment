package com.example.login.loginassignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.login.loginassignment.model.Data;
import com.example.login.loginassignment.model.User;

public interface UserRepository extends MongoRepository<Data, String>{
	
	@Query(value = "{udata:{$elemMatch:{uname:?0}}}")
	Data findByUserName(String uname);
	
	User save(String uname);

}
