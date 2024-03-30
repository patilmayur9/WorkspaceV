//Find the largest number in array
package com.arrayoperations;
import java.util.Scanner; 

public class ArrayMissingNum
{
 public static void main (String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array length : ");
		int range=sc.nextInt();
		
		int a[]=new int[range];

		System.out.println("Enter the Array elements ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Largest number in array is ");
		int temp=a[0];
		for(int i=0;i<a.length;i++)// 34 56 78 9 3 
		{
			if(a[i]>temp)
			temp=a[i];		
		}
		System.out.println("...."+temp);
	}
}
