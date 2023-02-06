package com.cogent.bean;

import org.springframework.stereotype.Component;

@Component
public class HelloService {

	public String sayHello(String str) {
		return "Hello" + str +", welcome to spring boot application!!!";
	}

}
