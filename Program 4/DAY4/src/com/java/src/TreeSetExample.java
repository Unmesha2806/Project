

package com.java.src;

import java.util.TreeSet;

public class TreeSetExample {
	

     public static void main(String args[]) {
    	 
     
         // TreeSet of String Type
         TreeSet<String> tset = new TreeSet<String>();

         // Adding elements to TreeSet<String>
         tset.add("ABC");
         tset.add("String");
         tset.add("Test");
         tset.add("Pen");
         tset.add("Ink");
         tset.add("Jack");

         //Displaying TreeSet
         System.out.println(tset);
         
         
     }
}