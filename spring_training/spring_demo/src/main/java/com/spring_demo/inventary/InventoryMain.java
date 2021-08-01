package com.spring_demo.inventary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InventoryMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext invProd = new ClassPathXmlApplicationContext("inventory_main.xml");
		
	}
}
