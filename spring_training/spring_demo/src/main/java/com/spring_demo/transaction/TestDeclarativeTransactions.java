package com.spring_demo.transaction;


import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDeclarativeTransactions {
	public static void main(String[] args) throws Exception {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("transaction.xml");
	}
	
	private static int generateId(){
		return new Random().nextInt(500);
	}
}
