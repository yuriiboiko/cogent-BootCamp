package com.cogent.day6Assignment;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
		MyThread mt = new MyThread();
		MyThread mt1 = new MyThread();
		
		mt.setPriority(1);
		mt1.setPriority(10);
		
		mt.start();
		mt1.start();
		
		/*
		for (int i = 0; i < 10; i++) {
			System.out.println("I am a thread, im form main with name:" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		 */		
		
		MyThreadImplRunnable threadRun = new MyThreadImplRunnable();
		
		Thread t1 = new Thread(threadRun);
		t1.start();
		
		Thread t2 = new Thread(threadRun);
		t2.start();

		
		
	}

}
