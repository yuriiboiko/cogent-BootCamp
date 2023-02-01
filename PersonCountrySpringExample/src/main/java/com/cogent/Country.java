package com.cogent;

public class Country {
private int id;
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Country() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Country [id=" + id + ", name=" + name + "]";
}



	
	
}
