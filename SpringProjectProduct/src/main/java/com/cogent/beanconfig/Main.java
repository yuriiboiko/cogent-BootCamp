package com.cogent.beanconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ap= new AnnotationConfigApplicationContext(ProductBean.class);
		Product p1 = ap.getBean("product", Product.class);
		System.out.println("Product id: "  + p1.getpId());
		System.out.println("Product name: "  + p1.getpName());
		System.out.println("Product price: $"  + p1.getPrice());

		
	}

}
