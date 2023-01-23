package com.cogent.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(20);
		al.add(3);
		
		
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
}
