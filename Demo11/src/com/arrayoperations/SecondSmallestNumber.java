package com.arrayoperations;

import java.util.Scanner;

public class SecondSmallestNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length : ");
		int length=sc.nextInt();
		
		int array[]=new int [length];
		System.out.println("Enter "+length+" Array elements  ");
		
		for (int i=0;i<length;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Before sorting array is ");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	 
		int  temp=0; 
		 
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				if(array[i]>array[j]) 
				{
					 temp=array[i];
					 array[i]=array[j];
					 array[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting array is ");
		for (int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("smallest number in array is :  "+array[0]);
		System.out.println("Second smallest number in array is :  "+array[1]);
		System.out.println("largest number in array is :  "+array[length-1]);
		System.out.println("Second largest number in array is :  "+array[length-2]);
	}

}
