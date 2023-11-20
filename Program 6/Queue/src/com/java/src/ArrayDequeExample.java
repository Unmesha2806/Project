package com.java.src;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {  
	
   public static void main(String[] args) {  
	   
	   
	   
	 //public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

	   // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

	   // void: This is the return type of the method. "Void" means that the method does not return any value.

	   //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

	  //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
	  		
	   
   //Creating Deque and adding elements
	   
   ArrayDeque<String> deque = new ArrayDeque<>();  
   deque.add("Ravi");    
   deque.add("Vijay");     
   deque.add("Ajay");  
   
   //Traversing elements  
   
   for (String str : deque) {  
   System.out.println(str); 
   
   }  
   
   }  
}  