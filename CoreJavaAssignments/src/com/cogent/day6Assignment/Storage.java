package com.cogent.day6Assignment;

public class Storage {
	private int val;
	
	private boolean isReady = false;

	public synchronized int getVal() {
		while(!isReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		isReady=false;
		notify();
		return val;
	}

	public synchronized void setVal(int val) {
		while(isReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.val = val;
		isReady=true;
		notify();
	}

	public Storage() {
		super();
		this.val=0;
	}

	public Storage(int val) {
		super();
		this.val = val;
	}
	
	
	

}
