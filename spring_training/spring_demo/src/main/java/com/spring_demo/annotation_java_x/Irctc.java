package com.spring_demo.annotation_java_x;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Irctc {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cta = new ClassPathXmlApplicationContext("annotation_javax.xml");
		Passanger psng = cta.getBean("passanger", Passanger.class);
		Train trn = cta.getBean("train", Train.class);
		psng.setPassagerName(123456789, null);
		System.out.println(psng);
		System.out.println(trn);
				
		cta.close();
	}
}