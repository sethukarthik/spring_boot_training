package com.spring_demo.maven_demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_demo.java_config.Train;

public class ExcuteMavenDemo {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("maven_demo.xml");
		Account acc = (Account) cpxac.getBean("acc_1");
		acc.setCustomer(new Customer(1,"A"));
		System.out.println(acc.getCustomer());
//		Account acc = cpxac.getBean("account_1", Account.class);
//		System.out.println(acc);
//		acc.print();
//		Account acc_1 = cpxac.getBean("account_1", Account.class);
//		System.out.println(acc_1);
//		Train t = (Train) cpxac.getBean("javaT");
		//Singleton will available until the container get close(It will cache by the container)
		//Prototype will available until his job done. Once his job done it will garbage collected (It won't cache by the container)
		cpxac.close();
	}
	
}