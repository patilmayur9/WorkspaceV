package com.arrayoperations;
import java.lang.*;
import java.util.*;
public class ArrayMinMaxElementFind
{
	
	  
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int[]array =new int[6];
			System.out.println("Enter the Array elements of Size "+array.length);
			
			//user Enter 6 Elements are stored in array one by one
			for(int j=0;j<array.length ; j++ )
			{
				array[j]=sc.nextInt();
				 
			}
			
			//printing the user inputed array element
			System.out.print("User Entered array Elements are : ");
			for (int i=0;i<array.length;i++)
			{
				System.out.print(array[i]+"\t");
			}
			
			System.out.println();
						
			//maximum Element in array logic
			System.out.println("Maximum Number in Given array is  ");
			int max1[]= {0};
			for (int i=0 ;i<array.length;i++)
			{
				if(max1[0]<array[i])
				{
					max1[0]=array[i];
				}
			}			 
			System.out.print(max1[0]);
			
			System.out.println();
			
			//minimum Element in array logic
			System.out.println("Minimum number in Given array is  ");
			int min[]= {0};
			min[0]=array[0];
			 for(int i=1;i<array.length;i++)
			 {
				 if(array[0]>array[i]) 
				 {
					 min[0]=array[i];
				 }
			 }
			 System.out.println(min[0]);
		}

 }
