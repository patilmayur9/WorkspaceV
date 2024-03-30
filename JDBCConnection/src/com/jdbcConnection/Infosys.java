package com.jdbcConnection;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Infosys 
{
	 public static void main(String[] args) 
	 {
		
		     
//		    // Driver Code
//		    public static void main (String[] args)
//		    {
		     
		        int arr[] = { 3, 9, 12, 13, 15 };
		        int n = arr.length;
		     
		        //CodingSolution
		        System.out.println(xorOfArray(arr, n));//4
		 
//		    }
		 

		
	}
//Java program to find the XOR of
		// all elements in the array
		 /*XOR working both values are same 1,1 and 0,0 output is 0 and values are different 1 and 0 or 0,1 output = 1
		  *  // Example 1: XOR with integers
        		int a = 5; // binary: 0101
        		int b = 3; // binary: 0011 
        		int result = a ^ b; // binary: 0110 (decimal 6)
		  */
		     
		    // Function to find the XOR of
		    // all elements in the array
		    static int xorOfArray(int arr[], int n)
		    {
		        // Resultant variable
		        int xor_arr = 0;
		     
		        // Iterating through every element in
		        // the array
		        for (int i = 0; i < n; i++) {
		     
		            // Find XOR with the result
		            xor_arr = xor_arr ^ arr[i];
		        }
		     
		        // Return the XOR
		        return xor_arr;
		    }
}
/*System.out.println("Enter any array size : ");
Scanner sc=new Scanner (System.in);
int length=sc.nextInt();
int a[] =new int[length];
System.out.println("enter array element : ");
for(int i=0;i<length;i++)
{
	 a[i]=sc.nextInt();
}

for(a[] aa:a[])*/