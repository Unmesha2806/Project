// Write a Java program that demonstrates how to handle an ArrayIndexOutOfBoundsException by using a try-catch block.


package com.java.src;

public class ArrayExpression { // Declaration of the class named ArrExp
	
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3}; // Declare and initialize an integer array 'arr' with elements 1, 2, and 3.
        
		try {  // Start of a try block to handle potential exceptions
			System.out.println(arr[4]); // Attempt to access the element at index 4 of the 'arr' array.
		} catch (ArrayIndexOutOfBoundsException e) { // Catch the ArrayIndexOutOfBoundsException if it occurs and assign it to the variable 'e' 
		
			System.out.println("Its Array Out of Bound...");
		}
		
	}
	
}


