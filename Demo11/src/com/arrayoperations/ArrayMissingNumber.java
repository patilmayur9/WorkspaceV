//2. Find the Missing number from Array
package com.arrayoperations;
import java.util.Scanner;
public class ArrayMissingNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range ");
		int range=sc.nextInt();
		int a[]=new int[range];
		System.out.println("Enter the array element ");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("missing numbers are in given Array is : ");
		System.out.println(); 

		int count,temp=1;

		 for(int k=0; k < a.length ; k++)
		{
			count=0;		 
			for(int j=0;j<a.length;j++)
			{
				if(temp == a[j])
				{
					 count++;
				}		
			 }  
			if(count==0)
				System.out.print(temp+" ");	
			
		temp++;
		}
	}
}



			 
