package com.cogent.controller;

import java.util.Scanner;

import com.cogent.services.CustomerService;

public class CustomerController {

	private CustomerService cs;

	public CustomerController() {
		super();
		cs = new CustomerService();
	}

	public void run(int choice) {
		Scanner sc = new Scanner(System.in);
		String cid;
		switch(choice) {
		case 1://add
			System.out.println("Adding record");
			cs.save();
			break;
		case 2://read
			System.out.println("Reading record");
			cs.fetch();
			break;
		case 3://update
			System.out.println("Please enter the customer ID to be updated!");
			 cid = sc.next();
			cs.modify(cid);
			break;
		case 4://delete
			System.out.println("Please enter the customer ID to be deleted!");
			cid = sc.next();
			cs.remove(cid);
			break;
		case 5://Find Customer by id 
			System.out.println("Please enter the customer ID to be found!");
			cid = sc.next();
			cs.search(cid);
			break;
		case 6:// find Youngest
			System.out.println("Searching for youngest Costumer!");
			cs.findYoungest();
			break;
		default:
			break;
		}
	}




}
