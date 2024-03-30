package com.arrayoperations;

import java.util.Scanner;

public class ArrayDecendingOrder
{
	 //sanfoundry.com
	    public static void main(String[] args) 
	    {
	        int n, temp;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = scanner.nextInt();
	        
	        int a[] = new int[n];
	        
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = scanner.nextInt();//2,10,5,60,40
	        }
	        for (int i = 0; i < n; i++) //2//10
	        {
	            for (int j = i + 1; j < n; j++) //10,5,60,40//5
	            {
	                if (a[i] > a[j]) //2>10//10>5
	                {
	                    temp = a[i];//temp=10
	                    a[i] = a[j];//a[i]=5
	                    a[j] = temp;//a[j]=10
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[n - 1]);
	    }
	

}
