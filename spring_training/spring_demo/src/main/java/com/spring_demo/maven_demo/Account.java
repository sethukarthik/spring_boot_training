package com.spring_demo.maven_demo;

public class Account {

	private Customer customer;

	public Account(Customer customer) {
		this.customer = customer;
		System.out.println("Account Constuctor with customer");
	}

	public Account() {
		System.out.println("Default Account Constuctor");
	}
	
	
}
