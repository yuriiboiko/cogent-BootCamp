package com.cogent.ex1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
			//xml base bean configuration
			ApplicationContext ctx= new ClassPathXmlApplicationContext("spring/bean.xml");
			Greeting g=ctx.getBean("greet",Greeting.class);
			g.message();
			System.out.println();

			
			ApplicationContext ctx1= new ClassPathXmlApplicationContext("spring/bean.xml");
			Person p1=ctx.getBean("personS",Person.class);
			System.out.println("Name: " + p1.getpName());
			System.out.println("ID: " + p1.getpId());
			System.out.println("Age: " + p1.getpAge());
			System.out.println();
			
			ApplicationContext ctx2= new ClassPathXmlApplicationContext("spring/bean.xml");
			Person p2=ctx.getBean("personC",Person.class);
			
			System.out.println("Name: " + p2.getpName());
			System.out.println("ID: " + p2.getpId());
			System.out.println("Age: " + p2.getpAge());
			System.out.println();

			//java base bean configuration
			ApplicationContext contex =new AnnotationConfigApplicationContext(ApplicationBean.class);
			Person p3= contex.getBean("person",Person.class);
			
			System.out.println("Name: " + p3.getpName());
			System.out.println("ID: " + p3.getpId());
			System.out.println("Age: " + p3.getpAge());
			

	}

}
