package com.spring_demo.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Irctc {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext  acac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Train train = acac.getBean("train", Train.class);
		Passanger psg = acac.getBean("passanger", Passanger.class);
		psg.setPassagerName(123456789l, "Sethu");
		System.out.println(psg);
		train.setPassanger(psg);
		train.setTrainCode(12662);
		train.setTrainName("Pothigai");
		System.out.println(train);
	}
}