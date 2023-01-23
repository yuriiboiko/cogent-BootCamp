package com.cogent.assignments.inheritancepolymorphism.q3;

public class Syrup extends Medicine{

	public Syrup(String mName, String compAddress) {
		this.mName = mName;
		this.compAddress = compAddress;
	}
	@Override
	public void displayLabel() {
		System.out.println("Medicine name: " + mName + ". Companies address: " + compAddress);
		System.out.println("One teaspoon a day for two weeks");
	}
	
	

}
