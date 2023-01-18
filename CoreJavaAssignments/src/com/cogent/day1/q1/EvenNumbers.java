/**
 * 
 */
package com.cogent.day1.q1;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author  : Yurii Boiko
 * @Date	: Jan 17, 2023
 * Write a program to list all even numbers less than or equal to the number n. Take
 * the value of n as input from user.
 */
public class EvenNumbers {

	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number between 0 and 2^31– 1");
		n=sc.nextInt();
		System.out.println("You have entered "+ n + ". Heres the following result:");
		for (int i = 2; i <= n; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println("\nFinished!");

	}

}
