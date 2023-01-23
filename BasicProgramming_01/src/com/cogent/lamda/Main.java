package com.cogent.lamda;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		MyInterface mi = ()->System.out.println("MyInterface has been called");
		mi.method1();
		
		Sum s= (x,y) -> System.out.println("Sum of two numbers is: " + (x+y) );
	
		s.add(100, 200);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number to multiply.");
		int r= sc.nextInt();
		
	
		MultiplyInterface muli = (z) -> System.out.println("Multiple of the number is: "+ (z*z));
		muli.multiply(r);
	}

}
