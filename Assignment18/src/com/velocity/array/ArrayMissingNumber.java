//1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing. 
//You need to provide optimum solution to find the missing number. Number can not be repeated in the array.
package com.velocity.array;

public class ArrayMissingNumber 
{
	public static void main(String[] args)
	{
		int [] a= { 1,2,4,6,7,4,8,11,10,9};//array size is 10
		//int [] c=new int[100];we can declare the array and its size using new key word
		int temp=1,count;
		System.out.println("Array Elements are ");

		for(int j=0;j<a.length;j++)
		{
		 System.out.print(a[j]+"\t");
		}
		//using for each loop we can print the array elements
		//syntax of for each loop is  for(<data type> <variacble name> : <array name>)
		/*for(int j:a)
		{
			System.out.println(j);
		}*/
		System.out.println();
		
		System.out.println("Array length is "+a.length);		
		
		System.out.println("Missing numbers in given array is  ");
		while(temp<=a.length)//1>=10
		{
			count=0;
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==temp)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println(temp);
			}
		temp++;	
		}
	}
}


//System.out.println(a[1]==1);//false
//System.out.println(a[1]==2);//true

