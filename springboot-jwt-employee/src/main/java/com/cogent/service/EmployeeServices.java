package com.cogent.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.entity.Employee;
import com.cogent.repository.EmployeeRepository;

@Service
public class EmployeeServices {
	@Autowired
	EmployeeRepository er;
	
	public List<Employee> getAll(){
		return (List<Employee>) er.findAll();
	}
	
	public Employee save(Employee e) {
		return er.save(e);
	}
	
	public void delete(Employee e) {
		er.delete(e);
	}
	
	public Optional<Employee> getId(int id){
		
		return er.findById(id);
	}
	
	
}
