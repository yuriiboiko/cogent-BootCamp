package com.cogent.Stream;

import java.util.stream.Stream;

public class Sample02 {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("drop the sword here".split(" "));
		stream.forEach((s)-> System.out.println(s));
	
	}

}
