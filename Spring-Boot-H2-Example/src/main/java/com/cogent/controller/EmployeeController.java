package com.cogent.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Employee;
import com.cogent.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService es;
	
	@GetMapping("/employees")
	public List<Employee> fetchEmp(){
		
		return es.fetchEmployeeList();
	}
	
	@PostMapping("/employees")
	public Employee saveEmp(@Validated @RequestBody Employee e) {
		return es.saveEmp(e);
	}
}
