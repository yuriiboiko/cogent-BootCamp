package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.bean.HelloService;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(HelloWorldApplication.class, args);
		HelloService hs =context.getBean("helloService", HelloService.class);
		System.out.println(hs.sayHello("Yurii"));
	}

	

}
