package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService{

	@Override
	public String greet() {
		return  "Hello world web from english greeting service";
	}

}
