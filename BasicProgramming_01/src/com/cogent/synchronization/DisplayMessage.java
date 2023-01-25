package com.cogent.synchronization;

public class DisplayMessage {

	public synchronized void sayHello(String name) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello how are you " + name+ "?");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
