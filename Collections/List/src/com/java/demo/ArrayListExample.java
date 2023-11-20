package com.java.demo;

import java.util.ArrayList;

public class ArrayListExample {
	
	
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add four values to the ArrayList
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);

        // Print the initial contents of the ArrayList
        System.out.println( numbers );

        // Add another value (50) in the middle (at index 2)
       numbers.add(2, 9);
      //numbers.remove(2);

        // Print the updated contents of the ArrayList
        System.out.println( numbers );
    }
}
