package com.cogent.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("spring/bean.xml");
		Person p= (Person)ac.getBean("person");
		Car c = p.getCar();
		System.out.println("car moodel "+ c.getModel());
	}

}
