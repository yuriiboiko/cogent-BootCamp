package com.cogent.assignments.inheritancepolymorphism.q3;

public class Tablet extends Medicine {

	public Tablet(String mName, String compAddress) {
		this.mName = mName;
		this.compAddress = compAddress;
	}
	
	@Override
	public void displayLabel() {
		
		
		System.out.println("Medicine name: " + mName + ". Companies address: " + compAddress);
		System.out.println("Store in cool dry place!");
	}
	
}
