package com.java.src;

import java.util.ArrayList;
import java.util.Arrays;

  

public class Main { //Main class
	
	
	public static void main(String args[]) {

		//public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.
		
		// static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

		// void: This is the return type of the method. "Void" means that the method does not return any value. //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

		//  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		
		
		
					

        // Normal Array

        // Need to specify the size for array

        int[] arr = new int[3];

        arr[0] = 1;

        arr[1] = 2;

        arr[2] = 3;
 

        // We cannot add more elements to array arr[]
 

        // ArrayList

        // Need not to specify size
 

        // Declaring an Arraylist of Integer type

        ArrayList<Integer> arrL = new ArrayList<Integer>();
 

        // Adding elements to ArrayList object

        arrL.add(1);

        arrL.add(2);

        arrL.add(3);
        
        arrL.add(4);
 

        // We can add more elements to arrL
 

        // Print and display Arraylist elements

        System.out.println(arrL);

        // Print and display array elements

        System.out.println(Arrays.toString(arr));

    }
}


