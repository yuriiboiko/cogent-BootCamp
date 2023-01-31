package com.cogent.mock;

import java.util.HashMap;

public class Mock{
	public static void main(String args[]){

		HashMap<Character, Integer> map= new HashMap<>();

		map.put(null, 1);
		System.out.println(map);

		//countCharOccurance("Hello World");
	}
	
	
	
	public static void countCharOccurance(String s) {
		
		HashMap<Character, Integer> map= new HashMap<>();
		
		char ch;
		int count;
		for (int i = 0; i < s.length(); i++) {
			ch= s.charAt(i);
			
			if(map.containsKey(ch)) {
				count = map.get(ch);
				map.put(ch,count+1);
			}
			else {
				map.put(ch, 1);
			}
					
		}
		System.out.println("The results of the count...");
		System.out.println(map);
		
	}
}
