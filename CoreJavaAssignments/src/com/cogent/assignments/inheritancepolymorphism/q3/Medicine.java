package com.cogent.assignments.inheritancepolymorphism.q3;

public class Medicine {

	String mName;
	String compAddress;
	
	
	public Medicine() {
		super();
	}


	public Medicine(String mName, String compAddress) {
		super();
		this.mName = mName;
		this.compAddress = compAddress;
	}


	public void displayLabel() {
		System.out.println("Medicine name: " + mName + ". Companies address: " + compAddress);

	}
}
