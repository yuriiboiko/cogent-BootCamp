package com.example.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Employee;
import com.example.spring.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> fetchEmployeeList() {
		return employeeService.fetchEmployeeList();
	}
	
	@PostMapping("/employees")
	public Employee saveEmployee(@Validated @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

}
