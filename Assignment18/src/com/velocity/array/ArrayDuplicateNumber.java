//2. Suppose you have array that containing elements 10,20,30,10, 30,50,60 Find out duplicate elements into array and print it.
package com.velocity.array;

public class ArrayDuplicateNumber
{
	public static void main(String[] args) 
	{
		int [] a= {10,20,30,10, 30,50,60};
		
		System.out.println("The given array is ");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		
		System.out.println();
		System.out.println("The given array length is : "+a.length);
		System.out.println("Duplicates numbers in array are : ");
		int b=0;
		int count;
		
		for(int j=0;j<a.length;j++)
		{
			count=0;
			for(int k=j;k<a.length;k++)
			{			
				if(a[j]==a[k])
				{
					count++;
				}			
			}
			
			if(count!=1)
			{				
				System.out.print(a[j]+" ");
			}
			 
		}
		
	}

}
