package com.cogent.Stream;

import java.util.ArrayList;
import java.util.List;

public class Sample05 {
	public static void main(String[] args) {
		
		List<Part> list= new ArrayList<>();
		
		list.add(new Part("pencil", 1, 101, 7, 4) );
		list.add(new Part("paper", 4, 102, 99, 4456));
		list.add(new Part("eraser", 2, 103, 5, 889));
		
		list.stream().filter((p)->p.getPrice()<99).map(pm-> pm.getName()).forEach( System.out::println);
	}
}
