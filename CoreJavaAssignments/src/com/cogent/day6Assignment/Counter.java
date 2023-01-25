package com.cogent.day6Assignment;

public class Counter implements Runnable {
	
	private Storage s;
	
	
	public Counter() {
		super();
		s= new Storage();
	}


	public Counter(Storage s) {
		super();
		this.s = s;
	}


	@Override
	public void run() {
		for (int i = 0; i < 1000000; i++) {
			s.setVal(i);
			
			//needed to add because it printed to quickly
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	public Storage getS() {
		return s;
	}


	public void setS(Storage s) {
		this.s = s;
	}

}
