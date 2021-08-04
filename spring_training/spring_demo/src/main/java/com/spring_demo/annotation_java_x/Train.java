package com.spring_demo.annotation_java_x;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class Train {
	
	private int trainCode;
	private String trainName;
	
	@Inject //Dependency Injection
	private Passanger passanger;
	
	@Inject
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
