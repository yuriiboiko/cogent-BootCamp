package com.cogent;

public class NonVegChef extends Chef{

	
	public void nonVegSection(Order order) {
		System.out.println("Your order has reached the nonVegSection");
		System.out.println();
		System.out.println("Order is ready (nonVeg)");
		String message = "nonVegChef to waiter: you can now deliver items to customer";
		prepareOrder(order, message);
		
	}
	
}
