package com.example.login.loginassignment.model;

public class Login {
	
	private String usn;
	private String psw;
	
	
	
	public Login() {
		super();
	}



	public Login(String usn, String psw) {
		super();
		this.usn = usn;
		this.psw = psw;
	}



	public String getUsn() {
		return usn;
	}



	public void setUsn(String usn) {
		this.usn = usn;
	}



	public String getPsw() {
		return psw;
	}



	public void setPsw(String psw) {
		this.psw = psw;
	}
	
	

}
