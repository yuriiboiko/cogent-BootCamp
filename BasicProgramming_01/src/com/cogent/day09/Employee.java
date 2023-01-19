package com.cogent.day09;

import java.io.Serializable;

public class Employee implements Serializable{

	private String eName;
	private double salary;
	
	public Employee(String eName, double salary) {
		super();
		this.eName = eName;
		this.salary = salary;
	}
	
	public void printInfo() {
		System.out.println("Employee name is " + eName);
		System.out.println("Employee salary is " + salary);

	}
}
