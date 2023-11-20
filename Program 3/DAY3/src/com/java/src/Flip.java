// Wap to toss a coin.

package com.java.src;

public class Flip {
        public static void main(String[] args) {
        	
        	
        	  if (Math.random() < 0.5){ // checks if a randomly generated number using Math.random() is less than 0.5.
        		  
                  System.out.println("Heads"); // specify 'if' block  if the condition in the  'if' block executes true
                  
          } else {
        	  
                  System.out.println("Tails"); // specify 'else' block if the condition in the if block is false
          }
  }
        	
}