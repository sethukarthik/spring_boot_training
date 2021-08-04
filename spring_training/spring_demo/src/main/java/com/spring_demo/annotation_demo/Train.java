package com.spring_demo.annotation_demo;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class Train {
	
	private int trainCode;
	private String trainName;
	
	@Autowired //Dependency Injection
	private Passanger passanger;
	
	@Autowired
	public Train() {
		System.out.println("Default Constructor");
	}

	public Train(int trainCode, String trainName, Passanger passanger) {
		this.trainCode = trainCode;
		this.trainName = trainName;
		this.passanger = passanger;
	}

	public int getTrainCode() {
		return trainCode;
	}

	public void setTrainCode(int trainCode) {
		this.trainCode = trainCode;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public Passanger getPassanger() {
		return passanger;
	}

	public void setPassanger(Passanger passanger) {
		this.passanger = passanger;
	}

	@Override
	public String toString() {
		return "Train [trainCode=" + trainCode + ", trainName=" + trainName + ", passanger=" + passanger + "]";
	}	
	
}
