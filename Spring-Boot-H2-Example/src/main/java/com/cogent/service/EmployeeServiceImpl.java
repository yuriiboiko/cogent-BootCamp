package com.cogent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Employee;
import com.cogent.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository er;
	
	@Override
	public Employee saveEmp(Employee e) {
		return er.save(e);
	}

	@Override
	public List<Employee> fetchEmployeeList() {

		
		return (List<Employee>) er.findAll();
	}

}
