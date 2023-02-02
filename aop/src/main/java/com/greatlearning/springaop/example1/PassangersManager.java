package com.greatlearning.springaop.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassangersManager {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("example1/aop.xml");
		PassangerDao passangerDao=(PassangerDao)context.getBean("passangerDao");
		System.out.println(passangerDao.getPassanger(1));
		context.close();
	}

}
