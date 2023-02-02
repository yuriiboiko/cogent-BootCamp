package com.gl.core;

import java.util.Scanner;

import com.gl.controller.EmployeeController;


public class App
{
	public static void main(String[] args)
	{
		int choice = 0;
		Scanner sc=new Scanner(System.in);
		EmployeeController ec = new EmployeeController();
		System.out.println("Welcome to Customer Management Application");
		do {
						
			displayMenu();

			choice=sc.nextInt();
			ec.run(choice);
			
		}while(choice!=5);
		sc.close();
		System.out.println("Application exited!");		

	}
	
	
	
	
	public static void displayMenu() {
		
		System.out.println("************************************");
		System.out.println("*              Menu                *");
		System.out.println("* 1 - Create record employee       *");
		System.out.println("* 2 - Update record employee       *");
		System.out.println("* 3 - Delete record employee       *");
		System.out.println("* 4 - Show all employee            *");  
		System.out.println("* 5 - Exit                         *");
		System.out.println("* Please enter your choice...      *");
		System.out.println("************************************");
	}
	
	
	
	
	
	
	
	
	
	
}
