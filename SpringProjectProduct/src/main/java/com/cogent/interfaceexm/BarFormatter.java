package com.cogent.interfaceexm;

import org.springframework.stereotype.Component;

@Component("bar")
public class BarFormatter implements Formatter {

	public void format() {
		System.out.println("Bar format");		
	}

}
