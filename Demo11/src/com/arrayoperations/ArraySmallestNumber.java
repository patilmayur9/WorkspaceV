package com.arrayoperations;

import java.util.Scanner;
class ArraySmallestNumber
{
	public static void main (String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length ");
		int range = sc.nextInt();
		int a[]=new int[range]	;
		System.out.println("Enter Array element : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Smallest element in array is ");
		int temp=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<temp)
				temp=a[i];
		}
		System.out.println(temp);
	}
}
