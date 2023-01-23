package com.cogent.lamda;

import java.util.Scanner;

public class MethodReferenceExample {

	
	public String reverse(String s) {
		System.out.println("In class method func");
		return new StringBuilder(s).reverse().toString();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word");
		String input=sc.next();
		
		ReverseInterface ri = (x) -> new StringBuilder(x).reverse().toString();

		System.out.println(ri.reverse(input));
		sc.close();
		
		MethodReferenceExample mre= new MethodReferenceExample();
		ReverseInterface ri1 =mre::reverse;
		System.out.println(ri1.reverse(input));
		
		
		
		
	}
}
