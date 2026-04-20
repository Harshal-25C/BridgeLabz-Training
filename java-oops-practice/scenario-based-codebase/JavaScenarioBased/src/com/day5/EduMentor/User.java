package com.day5.EduMentor;

public class User {
	protected String name;
	protected String email;
	protected int userId;
	
	public User(String name, String email, int userId) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
		this.userId = userId;
	}
	
	void displayUser() {
        System.out.println("Name: " + name + ", Email: " + email);
    }
}
