package com.spring_demo.inventary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InventoryMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext invProd = new ClassPathXmlApplicationContext("inventory_main.xml");
		//ClassPathXml
		System.out.println("----------" + invProd + "----------");
		
		Inventory inventory = invProd.getBean("inventory", Inventory.class);
		Inventory inventory_1 = invProd.getBean("inventory_1", Inventory.class);
		Inventory inventory_2 = invProd.getBean("inventory_2", Inventory.class);
		System.out.println(inventory);
		System.out.println(inventory_1);

		//we can also set the value here
		inventory.setProduct(invProd.getBean("product_3", Product.class));
		System.out.println(inventory);
		System.out.println(inventory.getProduct().getProductName());
		
		System.out.println("------ Stock -------");
		inventory_1.getProduct().testInheritance();
				
		System.out.println("------ New Product Stock -------");
		inventory_2.getProduct().testInheritance(); // Stock Method
		inventory_2.setProduct(new Product(140, "Snacks")); // There is no stock // Product p = new Product();
		System.out.println(inventory_2.getProduct());
		inventory_2.getProduct().testInheritance(); // Product Method
		
		Product pro = invProd.getBean("product", Product.class);
		System.out.println(pro);
		
		HelloWorld hell = invProd.getBean("hellow", HelloWorld.class);
//		hell
		HelloWorldTwo hell2 = invProd.getBean("hellow_2", HelloWorldTwo.class);
		hell2.hello_2();
		hell.hello();
		
		invProd.close();
	}
}
