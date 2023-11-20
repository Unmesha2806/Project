

package com.java.src;

import java.util.*;
public class HashMapExample{
	
  public static void main(String args[]){
	  
	  // Creating a HashMap
	  
    HashMap<Integer,String> hMap=new HashMap<>();
     
    
    hMap.put(101,"Cricket");
    hMap.put(105,"Hockey");
    hMap.put(111,"Basketball");

    System.out.println("HashMap Elements");
    
   //  Iterating through for loop
    
    for(Map.Entry mEntry : hMap.entrySet()){
      System.out.print("key: "+ mEntry.getKey() + " & Value: ");
      System.out.println(mEntry.getValue());
    }
  }
}


