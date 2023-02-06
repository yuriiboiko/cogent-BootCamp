package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.GreetingService;

@RestController
public class HelloController {
	
	
	@Autowired
	GreetingService gs;
	
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello spring Web."; 		
	}
	
	//handler
	@RequestMapping("/hello")
	public String home() {
		return  gs.greet();
	}
}
