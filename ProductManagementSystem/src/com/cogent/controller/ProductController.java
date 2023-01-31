package com.cogent.controller;

import java.util.Scanner;

import com.cogent.services.ProductServices;

public class ProductController {

	private ProductServices cs;

	public ProductController() {
		super();
		cs = new ProductServices();
	}

	public void run(int choice) {
		Scanner sc = new Scanner(System.in);
		int pid;
		String pCat=null;
		switch(choice) {
		case 1://add
			System.out.println("Adding product");
			cs.save();
			break;
		case 2://read
			System.out.println("Fetching all product record");
			cs.fetch();
			break;
		case 3://update
			System.out.println("Please enter the product ID to be updated!");
			pid = sc.nextInt();
			cs.update(pid);
			break;
		case 4://delete by id
			System.out.println("Please enter the product ID to be deleted!");
			pid = sc.nextInt();
			cs.removeById(pid);
			break;
		case 5://Delete by category 
			System.out.println("Please enter the product category to be deleted");
			pCat= sc.next();
			cs.removeByCat(pCat);
			break;
		case 6:// find product by id
			System.out.println("Searching for Product!");
			System.out.println("Please enter product id.");
			pid = sc.nextInt();
			cs.search(pid);
			break;
		case 7:// find product by category
			System.out.println("Searching for Product!");
			System.out.println("Please enter product category.");
			pCat = sc.next();
			cs.search(pCat);
			break;
		case 8:// find expired product
			break;
		case 9:// find cheapest product by category
			break;
		default:
			break;
		}
	}




}
