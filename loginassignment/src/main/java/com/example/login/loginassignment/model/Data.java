package com.example.login.loginassignment.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="login")
public class Data {
	@Id
	private String Id;
	private User[] udata;
	
	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Data(String id, User[] udata) {
		super();
		this.Id = id;
		this.udata = udata;
	}



	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}

	public User[] getUdata() {
		return udata;
	}

	public void setUdata(User[] udata) {
		this.udata = udata;
	}



	/*@Override
	public String toString() {
		return "Data [id=" + id + ", udata=" + Arrays.toString(udata) + "]";
	}
	*/
	

}
