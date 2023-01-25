package com.cogent.thread;

public class ClassExtendThread  extends Thread{

	@Override
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("I am a child thread too, im form thread class");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
