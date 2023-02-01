package com.cogent.beanconfig;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductBean {
	
	@Bean(name="product")
	public Product getProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product name");
		String name = sc.next();
		System.out.println("Enter product id number");
		int id =sc.nextInt();
		System.out.println("Enter product price");
		double price = sc.nextDouble();
		return  new Product(id, name, price);
	}
}
