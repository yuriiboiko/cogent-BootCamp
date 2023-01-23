package com.cogent.assignments.inheritancepolymorphism.q3;

public class Ointment extends Medicine {

	public Ointment(String mName, String compAddress) {
		this.mName = mName;
		this.compAddress = compAddress;
	}
	
	@Override
	public void displayLabel() {
		System.out.println("Medicine name: " + mName + ". Companies address: " + compAddress);
		System.out.println("For external use only!");
	}
	

	
}
