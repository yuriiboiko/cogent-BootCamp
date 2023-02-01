package com.cogent;

public class Chef {


	void prepareOrder(Order order, String vegRnonVeg) {
		
		callWaiter(vegRnonVeg);
	}

	void callWaiter(String vegRnonVeg) {
		System.out.println(vegRnonVeg);
		
	}


}
