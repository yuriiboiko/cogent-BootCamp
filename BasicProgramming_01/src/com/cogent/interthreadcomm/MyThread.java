package com.cogent.interthreadcomm;

public class MyThread extends Thread{

	static int total;
	public void run() {
		System.out.println("Child class is calculating the sum of 1000 numbers");
		
		synchronized (this) {
			for (int i = 0; i <= 1000; i++) {
				total+=i;
			}
			System.out.println("Child class notify method is called");
			notify();
		}
	}
}
