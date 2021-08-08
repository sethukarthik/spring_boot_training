package com.spring_demo.annotation_rework;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Location {
	
	@Inject
//	@Autowired -> Both work as similar the only difference @Autowired is from Spring and @Inject is from JEE or JSR 330
	private MedicalShop medicalShop;
	
	private String loco;
	
	public Location() {
		System.out.println("Location");
	}

	public Location(String location) {
		this.loco = location;
	}

	public MedicalShop getmShop() {
		return medicalShop;
	}

	public void setmShop(MedicalShop mShop) {
		this.medicalShop = mShop;
	}

	public String getLocation() {
		return loco;
	}

	public void setLocation(String location) {
		this.loco = location;
	}
	
}
