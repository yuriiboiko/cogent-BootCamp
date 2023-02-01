package com.cogent;

public class VegChef extends Chef{
	
	
	public void vegSection(Order order) {
		System.out.println("Your order has reached the vegSection");
		System.out.println("Order is ready (veg)");
		String message = "vegChef to waiter:you can now deliver items to customer";
		prepareOrder(order, message);
		
	}

}
