package com.java.src;

public class IfStatement {
	
	public static void main(String[] args) {
		
		
		
		 //public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

		  // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

		 // void: This is the return type of the method. "Void" means that the method does not return any value.

		 //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

		 //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		

	    int number = 10; // Declare an integer variable named 'number' and initialize it with the value 10.


	    // checks if number is less than 0
	    if (number < 0) {
	      System.out.println("The number is negative.");
	    }

	    System.out.println("Statement outside if block");
	  }
	
	/*
	 *  public static void main(String args[]) {
        int age;// Declare an integer variable named 'age' to store the user's age.
        System.out.println("Enter Your Age : ");  // Display a message asking the user to enter their age.
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input.
        age=in.nextInt();// Read an integer value from the user and store it in the 'age' variable.
         // Check if the 'age' is greater than or equal to 18 and print a message if the condition is met.
        if(age>=18)
        {
            System.out.println("You are Eligible For Vote...");
        }
    }
	 */

}
