//java program to reverse a word

package com.java.src;

import java.io.*;
import java.util.Scanner;

class Main {
	
	public static void main (String[] args) {  //public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

 // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.
 // void: This is the return type of the method. "Void" means that the method does not return any value.

 //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

  //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		  		
	
		String str= "Geeks", nstr="";
		char ch;
	
	System.out.print("Original word: ");
	System.out.println("Geeks"); //Example word
	
	for (int i=0; i<str.length(); i++)
	{
		ch= str.charAt(i); //extracts each character
		nstr= ch+nstr; //adds each character in front of the existing string
	}
	System.out.println("Reversed word: "+ nstr);
	}
}






