package com.cogent.day6Assignment;

public class Printer implements Runnable{
	private Storage s;


	public Printer(Storage s) {
		super();
		this.s = s;
	}


	public Printer() {
		super();
		s=new Storage();	
	}


	@Override
	public void run() {
		while(true) {
			System.out.println(s.getVal());
			
			//needed to add because it printed to quickly
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


}
