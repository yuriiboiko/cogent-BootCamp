package com.cogent;

import java.util.Scanner;

public class Customer {

	private String customerName;
	private int customerTableNumber;
	Order order;
	
	
	
	public Customer() {
		super();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter customers name.");
		setCustomerName(sc.next());
		order=new Order();
		
	}


	public String getCustomerName() {
		return customerName;
	}
	
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public Order orderItems() {
		System.out.println(customerName +" is giving the order");
		System.out.println("Enter number of items.");
		Scanner sc =new Scanner(System.in);
		
		int numOfItems =sc.nextInt();
		
		order.setNoOfItems(numOfItems);
		
		for (int i = 0; i < order.noOfItems; i++) {
			System.out.println("Enter the item number");
			order.Items[i][0] = sc.nextInt();
			System.out.println("Enter the quantity");
			order.Items[i][1] =sc.nextInt(); 	
		}

		return order;
	}
	
	
	void eat() {
		System.out.println(customerName +" is eating...");
		
	}
}
