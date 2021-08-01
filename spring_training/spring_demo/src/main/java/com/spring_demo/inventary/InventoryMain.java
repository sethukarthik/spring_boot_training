package com.spring_demo.inventary;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InventoryMain {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext invProd = new ClassPathXmlApplicationContext("inventory_main.xml");
		System.out.println("----------" + invProd + "----------");
		
		Inventory inventory = invProd.getBean("inventory", Inventory.class);
		Inventory inventory_1 = invProd.getBean("inventory_1", Inventory.class);
		System.out.println(inventory);
		System.out.println(inventory_1);

		//we can also set the value here
		inventory.setProduct(invProd.getBean("product_3", Product.class));
		System.out.println(inventory);
		System.out.println(inventory.getProduct().getProductName());
		
		Product pro = invProd.getBean("product", Product.class);
		System.out.println(pro);
		
		invProd.close();
	}
}
