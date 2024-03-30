package com.arrayoperations;

import java.lang.reflect.Array;
import java.util. *;
import java.io.*;
public class PassingArrayToMethod 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many Elements are you entered in array : ");
		int a=scanner.nextInt();
		
		System.out.println("Enter array elements of range "+a);
		System.out.println();
		int array[]=new int [a];//here we pass the user entered range
		System.out.println("Array proxy name is : " +array.getClass().getName());
		
		for (int i=0;i<array.length;i++)
		{
			
			array[i]=scanner.nextInt();
		}
		 
		PassingArrayToMethod passingarraytomethod=new PassingArrayToMethod();
		passingarraytomethod.calculateMinElement(array);
		
	}
	
	public void calculateMinElement(int arr[])
	{
		int firstElement=arr[0];
		for (int i=1;i<arr.length;i++)
		{
			if(arr[0]>arr[i])
			{
				firstElement=arr[i];
			}
		}
		System.out.println("Smallest Element in the array is : "+firstElement);
	 
	}

	 

}
