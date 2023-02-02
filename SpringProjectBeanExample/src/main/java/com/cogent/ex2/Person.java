package com.cogent.ex2;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	
	Car car;

	public Car getCar() {
		return car;
	}
	
	@Autowired
	public void myMethod(Car car) {
		this.car=car;		
	}

}
