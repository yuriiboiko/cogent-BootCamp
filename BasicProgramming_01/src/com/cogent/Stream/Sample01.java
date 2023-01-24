package com.cogent.Stream;

import java.util.stream.Stream;

public class Sample01 {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("alpha", "beta");
		stream.forEach((s)-> System.out.println(s));
	}

}
