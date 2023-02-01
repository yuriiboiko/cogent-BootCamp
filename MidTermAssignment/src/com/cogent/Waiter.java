package com.cogent;


public class Waiter {

	
	void menu() {
		System.out.println("-------------------------------");
		System.out.println("Heres the menu:");
		System.out.println("1. Full meal 			-- 100");
		System.out.println("2. Gobi Nudles 			-- 50");
		System.out.println("3. Chicken Biriyani		-- 200");
		System.out.println("4. Chicken65			-- 200");
		System.out.println("5. Chicken Curry		-- 100");
		System.out.println("6. Chicken Manchuria		-- 150");
		System.out.println("7. Veg Biriyani 		-- 150");
		System.out.println("8. Veg Rice 			-- 50");
		System.out.println("9. Veg Palav 			-- 100");
		System.out.println("10. Veg Manchuria 		-- 50");

		System.out.println("-------------------------------");
	}
	
	void takeOrder(Customer customer) {
		System.out.println("Hi " + customer.getCustomerName() + ". What would you lie to order today?" );
		menu();		
		Order order = customer.orderItems();
		placeOrderToChef(order);
		customer.eat();
		
		Bill bill =new Bill();
		bill.generateBill(customer);
		
	}
	
	void placeOrderToChef(Order order) {
		System.out.println("--------------------------------");

		NonVegChef nVc =  new NonVegChef();
		VegChef vc =  new VegChef();

		for (int i = 0; i < order.noOfItems; i++) {
			System.out.println("Waiter placed " + (i+1) +" order to chef.");

			if(order.Items[i][0]<7) {
				nVc.nonVegSection(order);
			}else {
				vc.vegSection(order);
			}

		}
		System.out.println("--------------------------------");
		System.out.println("Waiter Brought items to customer.");

	}
	
}
