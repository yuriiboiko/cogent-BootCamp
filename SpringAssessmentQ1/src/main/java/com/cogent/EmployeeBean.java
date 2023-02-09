package com.cogent;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeBean {

	@Bean(name="employee")
	public Employee getEmployee() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String name = sc.next();
		System.out.println("Enter employee id number");
		int id =sc.nextInt();
		System.out.println("Enter employee salary");
		double salary = sc.nextDouble();
		
		
		
		
		
		return new Employee(id,name,salary);
	}
	
}
