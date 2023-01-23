package com.cogent.lamda;

import java.util.Scanner;
import java.util.function.Predicate;

public class MainPredicateExample {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		Predicate<Integer> p1 = (x)->x>=20;
		
		if(p1.test(age)) {
			System.out.println("You are eligible to work.");
		}else {
			System.out.println("You are not eligible to work");
		}
	
		sc.close();
	}
	
}
