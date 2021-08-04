package com.spring_demo.annotation_demo;

import org.springframework.stereotype.Component;

@Component
public class Passanger {

	private long pnr;
	private String fullName;
	
	public void setPassagerName(long pnr, String fullName) {
		this.pnr = pnr;
		this.fullName = fullName;
	}
	
	public Passanger() {
		System.out.println("This is Passanger default constructor");
	}

	public String getPassagerName() {
		return fullName;
	}

	public long getPnr() {
		return pnr;
	}

	public void setPnr(long pnr) {
		this.pnr = pnr;
	}

	@Override
	public String toString() {
		return "Passanger [pnr=" + pnr + ", fullName=" + fullName + "]";
	}

}