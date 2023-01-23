package com.cogent.lamda;

import java.util.Scanner;
import java.util.function.Function;

public class MainFunctionExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the radius of the circle");
		int radious = sc.nextInt();
		
		
		Function<Integer, Double> f1 = (x)->Math.PI*x*x;
		
		System.out.println("The area of a circle is: " + f1.apply(radious));
		
		
		
		sc.close();
		
	}
}
