package com.cogent.map;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class TreeMapExample {

	public static void main(String[] args) {
		Map<String, Integer> TreeMap = new TreeMap<>();
		
		TreeMap.put("John", 20);
		TreeMap.put("Alex", 63);
		TreeMap.put("steve", 10);
		TreeMap.put("remy", 48);

		Set<String> keys = TreeMap.keySet();
		System.out.println("Keys are: " + keys);

		Collection<Integer> values = TreeMap.values();
		System.out.println("Values are: " + values);

		System.out.println("Printing HashMap object");			
		for (String s : keys) {
			System.out.println("Key: " + s + ", Value: " + TreeMap.get(s));
			
		}	
	}

}
