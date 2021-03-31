package com.example.login.loginassignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="login")
public class User {
	
	private String fname;
	private String lname;
	@Id
	private String uname;
	private String password;
	private String password2;
	
	
	
	
	public User() {
		super();
	}



	public User(String fname, String lname, String uname, String password, String password2 ) {
		super();
		this.fname = fname;
		this.lname = lname;
		
		this.uname = uname;
		this.password = password;
		this.password2 = password2;
		
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public String getLname() {
		return lname;
	}



	public void setLname(String lname) {
		this.lname = lname;
	}



	public String getUname() {
		return uname;
	}



	public void setUname(String uname) {
		this.uname = uname;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getPassword2() {
		return password2;
	}



	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	
	
	@Override
	public String toString() {
		return "User [fname=" + fname + ", lname=" + lname + ", uname=" + uname + ", password=" + password
				+ ", password2=" + password2 +  "]";
	}

}
