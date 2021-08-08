package com.spring_demo.annotation_rework;

import org.springframework.stereotype.Component;

//@Component(value="medShop")
@Component(value="medShop") 
// We can rename the class variable name either this way or the above one
//Change the bean name won't affect the dependency variable name see - Location class MedicalShop varaible name
//But this will impact the bean name see - annotation_rework.xml file
public class MedicalShop {
	private String shopName;

	public MedicalShop() {
		System.out.println("MedicalShop");
	}
	
	public MedicalShop(String shopName) {
		this.shopName = shopName;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
}