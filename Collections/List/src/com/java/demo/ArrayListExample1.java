package com.java.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {
	
	public static void main(String[] args) {
		
	
	
	//Creating an arraylist of integers
	
	ArrayList<String> data = new ArrayList<>();
	
	 // Adding four values to the arraylist
	
	data.add("Apple");
	data.add("Banana");
	data.add("Grapes");
	data.add("Strawberry");
	
	Iterator<String> i = data.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}

	}
}
	
