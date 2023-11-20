//WAP in java to add two integers


package com.java.src;

import java.util.Scanner;

class AddTwoIntegers{

  public static void main(String[] args) {
    
    //Variable definition and assignment
    int first, second;
    
    Scanner sc = new Scanner(System.in); /* create a object */

    //Taking user input
    System.out.println("Enter an integer: ");
    first = sc.nextInt();
    
    System.out.print("Enter a second integer: ");
    second = sc.nextInt();

    //Add the numbers
    int sum = first + second;

    //Print the output
    System.out.println("The sum of two integers "+first+" and "+second+" is: "+sum);
  }
}
