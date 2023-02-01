package com.cogent;

public class Resturant {

	public static void main(String[] args) {
		
		System.out.println("Customer showed up");
		Customer cust1 =new Customer();
		System.out.println("waiter has been called");
		Waiter waiter1 = new Waiter();
		waiter1.takeOrder(cust1);
		
	}

}
