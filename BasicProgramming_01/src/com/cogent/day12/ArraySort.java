package com.cogent.day12;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
	public static void main(String[] args) {
		int a[] = {40,10,15,7};
		System.out.println("Before sorting:");
		for (int i : a) {
			System.out.println(i);
		}
		
		
		Arrays.sort(a);
		
		System.out.println("After sorting:");
		
		for (int i : a) {
			System.out.println(i);
		}
		
		
		String s[] ={"V","A","Z","P","a"};
		
		List<String> list = Arrays.asList(s);
		

		
		System.out.println("Before sorting:");
		for (String i : s) {
			System.out.println(i);
		}
		
		Arrays.sort(s);
		
		System.out.println("After sorting:");
		
		for (String i : s) {
			System.out.println(i);
		}
		
		
		System.out.println("Printing list from not sorted array");
		System.out.println(list);

		List<String> list1 = Arrays.asList(s);

		System.out.println("Printing list");
		System.out.println(list1);
		
		
	}
	
	
	
}
