package com.cogent.thread;

public class ClassImleRunnable implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			
			System.out.println("HI i am a thread from runnable interface");		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
