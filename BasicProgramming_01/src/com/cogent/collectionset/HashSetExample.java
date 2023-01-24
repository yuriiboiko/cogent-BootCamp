package com.cogent.collectionset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
public class HashSetExample {

	
	public static void main(String[] args) {
		Random obj = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> hashSet= new HashSet<Integer>();
		Set<Integer> linkedHashSet= new LinkedHashSet<Integer>();
		Set<Integer> treeSet= new TreeSet<Integer>();

		
		int r;
		for (int i = 0; i < 20; i++) {
			r=obj.nextInt(50);
			list.add(r);
			hashSet.add(r);
			linkedHashSet.add(r);
			treeSet.add(r);
		}
		
		System.out.println("List content: " + list);
		System.out.println("HashSet content: " + hashSet);
		System.out.println("LinkedHashSet content: " + linkedHashSet);
		System.out.println("TreeSet content: " + treeSet);

	}
}
