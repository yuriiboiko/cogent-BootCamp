package com.cogent.interthreadcomm;

public class MainThread {

	public static void main(String[] args) {

		MyThread mt = new MyThread();
		mt.start();
		
		synchronized (mt) {
		
			System.out.println("Main threat is waiting...");
			try {
				mt.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Main class got notified");
			System.out.println("The sum is: " + MyThread.total);
			
		}
	}

}
