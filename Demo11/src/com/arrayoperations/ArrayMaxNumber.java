package com.arrayoperations;
 
import java.lang.*;
public class ArrayMaxNumber 
{ 
	public static void main(String args[]) {
				int [] a={1,2,10,4,0,5};
				 a[0]=1;
				for (int i=0;i<a.length;i++)	
				{
					if(a[0]  < a[i] )  // only change < to > for min//is this logic valid for this array only
					{	
						 a[0]= a[i];
					}
				
				}
				System.out.println("Largest element in array is : "+a[0]);
	}
}
