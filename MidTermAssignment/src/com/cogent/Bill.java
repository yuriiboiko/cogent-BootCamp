package com.cogent;

public class Bill {
	int bill;
	static int TotalBill=0;
	
	void generateBill(Customer c) {
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("Dear "+ c.getCustomerName()+ ", here is your bill.");
		
		System.out.println("INVOICE");
		System.out.println("-------");
		System.out.println("Item				Quant	BILL");
		System.out.println("----				-----	----");
		int price;
		int count;
		for (int i = 0; i < c.order.noOfItems; i++) {
			count=c.order.Items[i][1];
			price=c.order.listPrice[(c.order.Items[i][0])-1];
			
			System.out.print(c.order.listItems[(c.order.Items[i][0])-1]);
			System.out.print("			"+count);
			System.out.println("	"+ price);
			TotalBill=TotalBill+price*count;
		}
		System.out.println("				-------------");
		System.out.println("Total Bill 				" +TotalBill);
		
	}
}
