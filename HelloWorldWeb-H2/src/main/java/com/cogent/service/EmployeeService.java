package com.cogent.service;

import java.util.List;

import com.cogent.entity.Employee;

public interface EmployeeService {

	Employee saveEmp(Employee e);
	List<Employee> fetchEmployeeList();
	
	
}
