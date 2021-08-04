package com.spring_demo.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Irctc {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  acac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Train train = acac.getBean("train", Train.class);
		Passanger psg = acac.getBean("passanger", Passanger.class);
		System.out.println(train);
		System.out.println(psg);
	}
}