package com.example.login.loginassignment.model;

import org.springframework.stereotype.Service;

@Service
public class Response {

	private boolean login;

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}

	
	
}
