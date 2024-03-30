package com.arrayoperations;

public class ArrayMatix
{
	public static void main(String[] args) 
	{
		//int arry [][]=new int[3][3];//declaration of multidimentional array
		int array[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Array proxy name is : " +array.getClass().getName());
		System.out.println("Array elements are : ");
		for (int i=0;i<array.length ;i++ )
		{
			for (int j=0;j<array.length;j++)
			{
				System.out.print( array[i] [j] +" ");
			}
			System.out.println();
		}
		 
				
	}
	
	

}
