//WAP to find the sum of elements of an array.

package com.java.src;

 public class SumOfArray{
	 
   public static void main(String args[]){ 
	   
	   //public is used outside the class
	   //To call a method with the help of an object, sometimes to call a method we require the help of an object.
	   // void return type does not return any value
	   // main method is  the entry point of the program as well as where the program starts
	    
	   //Initialising an array with elements
	   
      int[] array = {10, 20, 30, 40, 50, 10};
      
      int sum = 0;
      
      //Advanced for loop
      for( int num : array) {
          sum = sum+num;
      }
      
      System.out.println("Sum of array elements is:"+sum);
   }
}