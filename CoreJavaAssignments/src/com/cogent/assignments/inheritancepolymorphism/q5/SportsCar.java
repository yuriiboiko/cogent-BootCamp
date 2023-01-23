package com.cogent.assignments.inheritancepolymorphism.q5;

public class SportsCar extends Car{
	String airBallonType;
	
	

	public SportsCar(String speed, String noOfGear, String airBallonType) {
		super(speed, noOfGear);
		this.airBallonType = airBallonType;
	}



	@Override
	public void display() {
		super.display();
		System.out.println("Air ballon type: " + airBallonType );
	}
	
	
}
