package com.cogent.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


//order of insertion is preserved
public class LinkedHashMapExample {

	public static void main(String[] args) {

		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("John", 20);
		linkedHashMap.put("Alex", 63);
		linkedHashMap.put("steve", 10);
		linkedHashMap.put("remy", 48);

		Set<String> keys = linkedHashMap.keySet();
		System.out.println("Keys are: " + keys);

		Collection<Integer> values = linkedHashMap.values();
		System.out.println("Values are: " + values);

		System.out.println("Printing HashMap object");			
		for (String s : keys) {
			System.out.println("Key: " + s + ", Value: " + linkedHashMap.get(s));
			
		}			
	}

}
