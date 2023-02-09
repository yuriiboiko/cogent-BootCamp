package com.cogent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ap =new AnnotationConfigApplicationContext(EmployeeBean.class);
		Employee e1 = ap.getBean("employee", Employee.class);
		System.out.println(e1.toString());
	}

}
