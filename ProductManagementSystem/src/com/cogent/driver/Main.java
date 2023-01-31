package com.cogent.driver;

import java.util.Scanner;

import com.cogent.controller.ProductController;

public class Main {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc=new Scanner(System.in);
		ProductController cc= new ProductController();
		System.out.println("Welcome to Product Management System");
		do {
						
			displayMenu();

			choice=sc.nextInt();
			cc.run(choice);
			
		}while(choice!=10);
		sc.close();
		System.out.println("Application exited!");
		
	}

	public static void displayMenu() {
		System.out.println("*********************************************");
		System.out.println("*              Menu                         *");
		System.out.println("* 1 - Add product                           *");
		System.out.println("* 2 - Display product record                *");
		System.out.println("* 3 - Update product                        *");
		System.out.println("* 4 - Delete product by id                  *");
		System.out.println("* 5 - Delete product by catergory           *");
		System.out.println("* 6 - Find product by id                    *");
		System.out.println("* 7 - Find product by catergory             *");
		System.out.println("* 8 - Find expired products                 *");
		System.out.println("* 9 - Find cheapest product in catergory    *");
		System.out.println("* 10 - Exit                                 *");
		System.out.println("* Please enter your choice...               *");
		System.out.println("*********************************************");

	}
}
