package com.cogent.annotationexpm;

import org.springframework.stereotype.Component;


@Component
public class HistoryService {


	public void store() {
		System.out.println("Storing History");
	}
}
