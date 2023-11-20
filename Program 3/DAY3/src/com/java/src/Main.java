// WAP to check whether the number is even or odd.

package com.java.src;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // Create a Scanner object for user input.

        System.out.print("Enter a number: "); // Create a Scanner object for user input.
        int num = sc.nextInt();  // Read an integer from the user's input and store it in the 'num' variable.

        if (num%2 == 0) {  // Check if 'num' is even using the modulo operator (%).
            System.out.println(num + " is even"); 
            
            
            
        } else {
            System.out.println(num + " is odd");   // If 'num' is not even, print a message indicating that it's odd.
        }
    }
}