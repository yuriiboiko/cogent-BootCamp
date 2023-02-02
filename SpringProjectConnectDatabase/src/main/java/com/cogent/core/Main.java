package com.cogent.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cogent.doa.impl.EmployeeDAOImpl;
import com.cogent.model.Employee;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDAOImpl edi = (EmployeeDAOImpl) ac.getBean("employeeDAO");
		Employee e =new Employee(1, "alex", 20, 1000);
		edi.insert(e);
		
	}

}
