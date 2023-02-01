package com.cogent.annotationexpm;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.cogent.annotationexpm")
public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext cac= new AnnotationConfigApplicationContext(Main.class);
		ChatService cs =cac.getBean(ChatService.class);
		cs.chat();
		cac.close();
	}

}
