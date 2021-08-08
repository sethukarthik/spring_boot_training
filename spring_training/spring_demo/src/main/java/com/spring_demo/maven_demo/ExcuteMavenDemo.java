package com.spring_demo.maven_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ExcuteMavenDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("maven_demo.xml");
		Account acc = cpxac.getBean("account_1", Account.class);
		System.out.println(acc);
		acc.print();
		Account acc_1 = cpxac.getBean("account_1", Account.class);
		System.out.println(acc_1);
		cpxac.close();
		
		//Singleton will available until the container get close(It will cache by the container)
		//Prototype will available until his job done. Once his job done it will garbage collected (It won't cache by the container)
	}
	
}