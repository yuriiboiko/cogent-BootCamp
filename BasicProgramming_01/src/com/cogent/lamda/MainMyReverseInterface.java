package com.cogent.lamda;

import java.util.Scanner;

public class MainMyReverseInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any word");
		String input=sc.next();
		
		ReverseInterface ri = (x) -> new StringBuilder(x).reverse().toString();

		System.out.println(ri.reverse(input));
		sc.close();
		
	}

}
