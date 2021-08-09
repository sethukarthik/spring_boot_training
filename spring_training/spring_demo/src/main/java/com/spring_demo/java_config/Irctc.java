package com.spring_demo.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring_demo.maven_demo.Account;
import com.spring_demo.maven_demo.Customer;

public class Irctc {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  acac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
//		ClassPathXmlApplicationContext
		Train train = acac.getBean("train", Train.class);
		Passanger psg = acac.getBean("passanger", Passanger.class);
		psg.setPassagerName(123456789l, "Sethu");
		System.out.println(psg);
		train.setPassanger(psg);
		train.setTrainCode(12662);
		train.setTrainName("Pothigai");
		System.out.println(train);
		Account acc = (Account) acac.getBean("account");
		acc.setCustomer(new Customer());
		acc.getClass();
		acac.close();
	}  
}

