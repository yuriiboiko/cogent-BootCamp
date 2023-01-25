package com.cogent.synchronization;

public class MyThread extends Thread{
	DisplayMessage dm;
	String name;
	public MyThread(DisplayMessage dm, String name) {
		super();
		this.dm = dm;
		this.name = name;
	}
	
	@Override
	public void run() {
		dm.sayHello(name);
		
	}

}
