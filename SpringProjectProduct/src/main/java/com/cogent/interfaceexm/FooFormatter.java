package com.cogent.interfaceexm;

import org.springframework.stereotype.Component;

@Component("foo")
public class FooFormatter implements Formatter{

	public void format() {
		System.out.println("Foo formatter");
	}

}
