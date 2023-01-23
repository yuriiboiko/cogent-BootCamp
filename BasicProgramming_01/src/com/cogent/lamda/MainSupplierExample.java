package com.cogent.lamda;

import java.util.Date;
import java.util.function.Supplier;

public class MainSupplierExample {

	public static void main(String[] args) {
			
		Supplier<Date> s1 =() -> new Date();
		System.out.println(s1.get());

	}

}
