package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Employee;
import com.greatlearning.repository.EmployeeRepository;

@RestController
@RequestMapping("employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository er;
	
	@GetMapping
	List<Employee> findAll(){
		return er.findAll();
	}
	
	
	

}
