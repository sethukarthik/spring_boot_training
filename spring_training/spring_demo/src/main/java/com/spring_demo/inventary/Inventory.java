package com.spring_demo.inventary;

public class Inventory {
	private Product product; //has_a relationship
	private int count = 1;

	public Inventory(Product product) {
		this.product = product;
	}

	public Inventory() {
		System.out.println("Default Inventory " + count);	
		count++;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "Inventary [product=" + product + "]";
	}
}
