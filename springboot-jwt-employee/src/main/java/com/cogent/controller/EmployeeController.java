package com.cogent.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.entity.Employee;
import com.cogent.service.EmployeeServices;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices es;
	
	
	@GetMapping("/read")
	public List<Employee> read(){
		List<Employee> list= es.getAll();
		System.out.println("Retrived "+ list.size()+ " employee");
		return list;
		
	}
	
	@PostMapping("/create")
	public Employee create(@RequestBody Employee e) {
		System.out.println("Added employee");
		return es.save(e);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee e) {
		int id= e.getId();
		Optional<Employee> list = es.getId(id);
		if(list.isEmpty()) {
			System.out.println("No employee found...");
			System.out.println("Inserting employee with id: " +id);
		}else {
			System.out.println("Updating employee with id: "+id);

		}

		return es.save(e);
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestParam(value="id") Integer id) {
		Optional<Employee> list = es.getId(id);
		es.delete(list.get());
		System.out.println("Employee id "+ id+ " deleted");
	}
	
	
	
	
}
