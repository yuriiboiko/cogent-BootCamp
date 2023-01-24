package com.cogent.day7Assignment;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {

		Set<String> product= new TreeSet<String>();

		product.add("banana");
		product.add("apple");
		product.add("cherry");
		product.add("pineapple");
		product.add("banana");
		product.add("kiwi");
		Iterator<String> its =  product.iterator();

		while (its.hasNext()) {
			System.out.println(its.next());	
		}

		String first= null;
		String last = null;
		if(!product.isEmpty()) {
			first=product.iterator().next();
		}
		
		its =  product.iterator();
		while (its.hasNext()) {
			last=its.next();
		}
		System.out.println("Printing the first element:" + first);
		System.out.println("Printing the last element:" + last);

		System.out.println("The size of the product TreeSet: " + product.size() );
		product.remove("pineapple");
		System.out.println("After removal size of the product TreeSet: " + product.size() );

	}

}
