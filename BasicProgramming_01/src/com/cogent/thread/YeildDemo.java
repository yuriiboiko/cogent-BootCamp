package com.cogent.thread;

public class YeildDemo {
	
	public static void main(String[] args) {
/*		
		ChildThreadYield ct = new ChildThreadYield();
		ct.start();
		

		for (int i = 1; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		*/
		ChildThreadInterupt ct1 = new ChildThreadInterupt();
		ct1.start();
		ct1.interrupt();
		
		System.out.println("End of main");

		
		
		
	}

}
