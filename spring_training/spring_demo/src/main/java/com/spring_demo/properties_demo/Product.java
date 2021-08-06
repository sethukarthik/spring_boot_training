package com.spring_demo.properties_demo;

public class Product {
	private double price;
	private String name;
	
	public Product() {
	}
	
	public Product(double price, String name) {
		this.price = price;
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [price= " + price + ", Product Name= " + name + "]";
	}
}
