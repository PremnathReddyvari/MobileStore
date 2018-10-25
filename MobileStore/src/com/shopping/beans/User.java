package com.shopping.beans;

public class User {
	private int userId;
	private String name;
	private String password;
	private String email;
	private int active;

	public User() {
		this.userId = 0;
	}

	

	public User(int userId, String name, String password, String email, int active) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.email = email;
		this.active = active;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getActive() {
		return active;
	}



	public void setActive(int active) {
		this.active = active;
	}



}
