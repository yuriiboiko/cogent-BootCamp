package com.gl.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gl.employee.dao.EmployeeDAO;
import com.gl.employee.model.Employee;

public class EmployeeController {

	private ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");

	Scanner sc = new Scanner(System.in);


	public void run(int choice) {
		
		switch(choice) {
		case 1://add
			System.out.println("Adding record");
			Employee e = createEmployee();
			employeeDAO.insert(e);	
			break;
		case 2://update
			System.out.println("Please enter the eployee ID to be updated!");
			employeeDAO.update(sc.nextInt());
			break;
		case 3://delete
			employeeDAO.delete();
			break;
		case 4://read
			System.out.println("Reading employee record");
			employeeDAO.show();
			break;
		}
		
		
	}
	

	private Employee createEmployee() {
	
		System.out.println("Please enter employee ID.");
		int id =sc.nextInt();
		System.out.println("Please enter employee name.");
		String name =sc.next();
		System.out.println("Please enter employee age.");
		int age =sc.nextInt();
		System.out.println("Please enter employee salary.");
		int salary =sc.nextInt();
		System.out.println("Created employee object");
		return new Employee(id, name, age, salary);
	}

}
