package com.cogent.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	//order not of insertion is preserved
	public static void main(String[] args) {

			Map<String , Integer> hashMap = new HashMap<String, Integer>(); 
			hashMap.put("john",40);
			hashMap.put("Lee",35);
			hashMap.put("Roman",20);
			hashMap.put("Tom",40);
			hashMap.put("john",40);
			
			Set<String> keys =hashMap.keySet();
			System.out.println("Keys are: " + keys);

			Collection<Integer> values = hashMap.values();
			System.out.println("Values are: " + values);

			System.out.println("Printing HashMap object");			
			for (String s : keys) {
				System.out.println("Key: " + s + ", Value: " + hashMap.get(s));
				
			}			
			
		
	}

}
