package com.cogent.day6Assignment;

public class Main {

	public static void main(String[] args) {

		Storage storage = new Storage();
		
		Thread threadCounter = new Thread(new Counter(storage));
		Thread threadPrinter = new Thread(new Printer(storage));
	
		threadCounter.start();
		threadPrinter.start();

		
	}

}
