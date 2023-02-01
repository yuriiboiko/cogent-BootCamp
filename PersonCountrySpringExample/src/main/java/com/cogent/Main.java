package com.cogent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ac =new ClassPathXmlApplicationContext("spring/bean.xml");
		Person p = ac.getBean("person", Person.class);
		p.showPerson();

	}

}
