package com.spring_demo.annotation_rework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetInfo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("annotation_rework.xml");
		Location l = cp.getBean("location", Location.class);
		MedicalShop m = cp.getBean("medShop", MedicalShop.class);
		m.setShopName("Lakshmi");
		l.setmShop(m);
		System.out.println(l.getmShop().getShopName());
		cp.close();
	}
}
