package com.arrayoperations;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayDuplicateNumber

{	
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array Range : ");
		int length=scanner.nextInt();
		int a[] = new int[length];
		
		System.out.println("Enter the array element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scanner.nextInt();
		}
		
		System.out.println("Array elements are ");
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+ " ");
		}
		int count;
		System.out.println();
		System.out.println("Array Duplicate Elements are ");
		System.out.println();
		for(int i=0;i<a.length;i++)
		{	count=0;	
			for(int j=i+1 ; j<a.length;j++)//if array size is 1 then second for loop will not be executed 
			{
				if(a[i]==a[j])
				{
			        	count++;	
			        	//a[j]=();
			        	  //Array.setInt(a[j], a[j], 00); 
				}
			}
			if(count==1)//5,3,4,3,6,1,3,4,4,4//it count only last two occurances 
				 		//like 4 ,4 and 3 1 3 ==3,3 just like that and compare exact count ==1
			{
				System.out.println (a[i]);
			}
			
		}

	}
}