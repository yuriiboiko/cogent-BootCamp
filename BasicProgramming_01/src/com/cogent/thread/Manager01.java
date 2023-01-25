package com.cogent.thread;


public class Manager01 {

	public static void main(String[] args) {
		
		//creating a threat using a runnable interface
		ClassImleRunnable myClass = new ClassImleRunnable();
		Thread thread = new Thread(myClass);
		thread.start();
		
		ClassExtendThread cet =new ClassExtendThread();
		cet.start();
		
	}

}
