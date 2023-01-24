package com.cogent.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Sample04Collection {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> stream = list.stream();
		stream.forEach((s)-> System.out.println(s));

		
	}
}
