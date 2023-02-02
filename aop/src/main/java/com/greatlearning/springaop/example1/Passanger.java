package com.greatlearning.springaop.example1;

public class Passanger {

	private int id;
	public Passanger(int id)
	{
		this.id=id;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	@Override
	public String toString() {
		
		return "Passanger"+this.id;
	}
}
