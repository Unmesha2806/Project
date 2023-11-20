//WAP to  print  invert Triangle.

package com.java.src;

public class InvertTriangle
{
    public static void main(String args[])
    {
        int num = 9; // // Initialize the 'num' variable with the value 9
        
        while(num > 0)   // Use a while loop to control the number of rows
        {
            for(int i=1; i<=num; i++) //  Use a nested for loop to print 'num' spaces
            {
                System.out.print(" "+num+" ");  // Print the value of 'num' with spaces on either side
            }
            System.out.print("\n"); // Move to the next line after each row is printed
            
            num--;   // Decrease the value of 'num' by 1 for the next row
        }
    }
}

