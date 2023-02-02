package com.cogent.interfaceexm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Service {
	
	@Autowired
	@Qualifier("foo")
	private Formatter formatter;
	
	public void message() {
		 formatter.format();
	}


}
