package com.java.demo;

import java.util.*;

public class SetExample {
	
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("Java");
		set.add("Set");
		set.add("Example");
		set.add("Set");
		
		System.out.println(set);
	}

}
