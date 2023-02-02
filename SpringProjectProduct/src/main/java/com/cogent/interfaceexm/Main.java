package com.cogent.interfaceexm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.cogent.interfaceexm"})
public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(Main.class);
		Service fs= ctx.getBean(Service.class);
		fs.message();
		
		
	}

}
