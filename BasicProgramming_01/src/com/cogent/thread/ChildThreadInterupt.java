package com.cogent.thread;

public class ChildThreadInterupt extends Thread{

	@Override
	public void run() {


		try {
			for (int i = 1; i < 10; i++) {
				System.out.println("im lazy thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got interrupted");
		}


	}
}
