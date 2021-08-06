package com.spring_demo.properties_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductExecution {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		Product pro = acac.getBean("product", Product.class);
		System.out.println(pro);
		acac.close();
	}
}
