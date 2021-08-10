package com.spring_demo.lifecycle;

import org.springframework.beans.factory.BeanNameAware;

public class Customer implements BeanNameAware{
	
	private int userId;
	private String userName;
	
	public Customer() {
		System.out.println("Customer::Constructor::Default");
	}

	public Customer(int userId, String userName) {
		System.out.println("Customer constructor with parameters ");
		this.userId = userId;
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		System.out.println("Customer::SetUserId");
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("Customer::SetUserName");
		this.userName = userName;
	}
	
	public void print() {
		System.out.println("Printing instance method of customer");
	}

	@Override
	public String toString() {
		return "Customer [userId=" + userId + "UserName " + userName + "]";
	}

	public void setBeanName(String name) {
		System.out.println("Customer::SetBeanName::"+name);
	}
	
}