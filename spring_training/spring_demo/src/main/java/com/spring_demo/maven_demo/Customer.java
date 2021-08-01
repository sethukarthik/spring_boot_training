package com.spring_demo.maven_demo;

public class Customer {
	
	private int userId;
//	private String userName;
	
	public Customer() {
		System.out.println("Default customer constructor");
		// TODO Auto-generated constructor stub
	}

	public Customer(int userId) {
		System.out.println("Customer constructor with parameters ");
		this.userId = userId;
//		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

//	public String getUserName() {
//		return userName;
//	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + "]";
	}
	
}