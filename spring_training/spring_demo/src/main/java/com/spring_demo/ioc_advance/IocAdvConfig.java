package com.spring_demo.ioc_advance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocAdvConfig {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanInj = new ClassPathXmlApplicationContext("ico_advance.xml");
		
		Object insMethod = beanInj.getBean("instanceCall");

		beanInj.close();
	}
	
}
