package com.java.src;

import java.util.Scanner;

public class If_elseStatement {
	
	public static void main(String[] args) {
		
		 //public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

		  // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

		 // void: This is the return type of the method. "Void" means that the method does not return any value.

		 //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

		 //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		
		
		
		
	    int number = 10;

	    // checks if number is greater than 0
	    if (number > 0) {
	      System.out.println("The number is positive.");
	    }
	    
	    // execute this block
	    // if number is not greater than 0
	    else {
	      System.out.println("The number is not positive.");
	    }

	    System.out.println("Statement outside if...else block");
	  }
	
	
	/*
	    public static void main(String args[]) {
        int year; // integer variable named year
        System.out.println("Enter Year : "); //: Display a message to the user, asking them to enter a year.
        Scanner in = new Scanner(System.in); //Create a Scanner object named in to read input 
        year = in.nextInt(); // integer input from the user and store it in the year variable.
  //if statement checks whether the year is a leap year using the leap year rule
        
        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)) {
        	
       //year % 4 == 0: This condition checks if the year is evenly divisible by 4.
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }

    }
*/	 

}
