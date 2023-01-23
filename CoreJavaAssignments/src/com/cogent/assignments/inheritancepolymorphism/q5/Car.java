package com.cogent.assignments.inheritancepolymorphism.q5;

import java.util.Scanner;

public class Car {

	String speed;
	String noOfGear;
	
	public Car(String speed, String noOfGear) {
		this.speed = speed;
		this.noOfGear = noOfGear;
	}
	
	public Car() {
		this.speed = "0";
		this.noOfGear = "0";
	}
	
	public void drive() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed!");
		speed=sc.next();
		System.out.println("Enter number of gears!");
		noOfGear=sc.next();
	}
	
	public void display() {
		System.out.println("Speed: "+ speed + "\nNumber of gears: "+ noOfGear);
	}
	
	
}
