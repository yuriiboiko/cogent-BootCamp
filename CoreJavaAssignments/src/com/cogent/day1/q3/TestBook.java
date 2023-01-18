/**
 * 
 */
package com.cogent.day1.q3;

import java.util.Scanner;
/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 *
 */
public class TestBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of book you would like to add.");
		int n = sc.nextInt();
		Book [] books = new Book[n];
		createBooks(books);
		showBooks(books);
		
	}

	
	private static void createBooks(Book[] bk) {
		Scanner sc = new Scanner(System.in);
		String title;
		double price;
		for (int i = 0; i < bk.length; i++) {
			System.out.println("Enter book Title...");
			title= sc.nextLine();
			System.out.println("Enter book Price...");
			price= sc.nextDouble();
			bk[i]= new Book(title, price);
			// Consuming the leftover new line
	        // using the nextLine() method
	        sc.nextLine();
		}
		
	}
	
	private static void showBooks(Book[] bk) {
		System.out.printf(" %-24s  %-6s %n","Book Title", "Price");
		for (int i = 0; i < bk.length; i++) {
			System.out.printf(" %-24s %-1s %-4.2f %n",bk[i].getTitle(), "$" ,bk[i].getPrice());
		}
		
	}
}
