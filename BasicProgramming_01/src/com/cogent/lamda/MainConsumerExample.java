package com.cogent.lamda;

import java.util.function.Consumer;

public class MainConsumerExample {

	public static void main(String[] args) {
			
		Consumer<Integer> c1 = x-> System.out.println("I have accepted " + x);
		c1.accept(100);
	}

}
