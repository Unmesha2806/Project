package com.java.src;
import java.util.Scanner;

/*
Else If Ladder
90-100 Grade-A
80-89  Grade-B
70-79  Grade-C
<70    Grade-D
*/
// This is a Java program that calculates and assigns a grade based on the average mark.
public class else_ifStatement {
	
	public static void main(String args[]) {
		
		
		 //public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

		  // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

		 // void: This is the return type of the method. "Void" means that the method does not return any value.

		 //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

		 //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		
		
        float avg; // Declare a variable named 'avg' to store the average mark.
        System.out.println("Enter The Average Mark : ");// Display a message asking the user to enter the average mark.
        Scanner in = new Scanner(System.in); // Create a Scanner object for user input.
        avg = in.nextFloat();// Read a floating-point number from the user and store it in the 'avg' variable.
        // Check the value of 'avg' and assign a grade accordingly.
        if (avg >= 90 && avg <= 100) { // If 'avg' is between 90 and 100, print "Grade A."
            System.out.println("Grade A");
        } else if (avg >= 80 && avg <= 89) {  // If 'avg' is between 80 and 89, print "Grade B."
            System.out.println("Grade B");
        } else if (avg >= 70 && avg <= 79) { // If 'avg' is between 70 and 79, print "Grade C."
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D"); // If 'avg' is less than 70, print "Grade D."
        }
    }

}
