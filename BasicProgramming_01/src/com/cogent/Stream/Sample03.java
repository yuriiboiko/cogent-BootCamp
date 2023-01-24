package com.cogent.Stream;

import java.util.stream.Stream;

public class Sample03 {

	public static void main(String[] args) {
		
		Stream<Part> stream = Stream.of(
				new Part("pencil", 1, 101, 7, 4),
				new Part("paper", 4, 102, 99, 4456),
				new Part("eraser", 2, 103, 5, 889));
		
		stream.forEach((s)-> System.out.println(s));
	
	}

}
