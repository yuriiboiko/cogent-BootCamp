package com.greatlearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.EmployeeContact;
import com.greatlearning.repository.EmpContactRepository;

@RestController
@RequestMapping("contact")
public class EmpContatctController {
	@Autowired
	EmpContactRepository ecr;
	
	@GetMapping
	List<EmployeeContact> findAll(){
		return ecr.findAll();
		
	}
}
