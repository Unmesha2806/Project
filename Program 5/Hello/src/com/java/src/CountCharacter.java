// Wap to count the total number of characters in a string


package com.java.src;

public class CountCharacter    { 
	
    public static void main(String[] args) { 
    	
    	
    	
//public: This is an access modifier that specifies the visibility of the method. In this case, "public" means that the method can be accessed from any class.

 // static: This is a keyword in Java that indicates that the method belongs to the class itself rather than an instance of the class. In the context of the main method, it means that you can call this method without creating an object of the class it is in.

 // void: This is the return type of the method. "Void" means that the method does not return any value.

 //  main: This is the name of the method. In Java, the main method is a special method that serves as the entry point for a Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method to start executing the program.

 //  (String args[]): This is the method's parameter list. It specifies that the main method accepts an array of strings as its argument.
		
        String string = "The best of both worlds";    
        int count = 0;    
            
        //Counts each character except space    
        for(int i = 0; i < string.length(); i++) {
        	//System.out.println(i)
System.out.println(string.charAt(i));
            if(string.charAt(i) != ' ')    
                count++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
    }    
}     