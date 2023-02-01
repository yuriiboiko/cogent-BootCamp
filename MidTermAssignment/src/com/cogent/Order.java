package com.cogent;

public class Order {

	static int orderNum;
	int Items[][];
	int noOfItems;
	
	String listItems[]= {"Full meal", "Gobi Nudles", "Chicken Biriyani", "Chicken65", "Chicken Curry", "Chicken Manchuria", "Veg Biriyani", "Veg Rice", "Veg Palav", "Veg Manchuria"};
	int listPrice[]= {100,50,200,200,100,150,150,50,100,50};
	
	public void setNoOfItems(int noOfItems) {
		this.noOfItems=noOfItems;
		Items=new int[noOfItems][2];
		orderNum++;
	}
	
}
