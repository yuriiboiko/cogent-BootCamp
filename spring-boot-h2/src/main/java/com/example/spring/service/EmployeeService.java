package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee> fetchEmployeeList();
	

}
