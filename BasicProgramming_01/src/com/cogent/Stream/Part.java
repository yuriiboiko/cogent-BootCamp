package com.cogent.Stream;

public class Part {
	
	private String name;
	private int weight;
	private int number;
	private int price;
	private int quantity;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Part() {
		super();
		this.name = "Default";
		this.weight = 0;
		this.number = 0;
		this.price = 0;
		this.quantity = 0;
	}
	public Part(String name, int weight, int number, int price, int quantity) {
		super();
		this.name = name;
		this.weight = weight;
		this.number = number;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "name=" + name + ", weight=" + weight + ", number=" + number + ", price=" + price + ", quantity="
				+ quantity ;
	}
	
	
	

}
