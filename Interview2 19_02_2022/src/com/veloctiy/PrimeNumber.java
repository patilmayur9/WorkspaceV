
package com.veloctiy;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range : ");
		int i= sc.nextInt();//10
		
		int temp=1;
		int count=0;
		while(temp<i)//1<10 
		{			 
			for(int j=1;j<=i;j++)
			{
				if(j%temp==0 && j%)
				{
				 count++;
				}				 
			}
			
			if(count==2)
			{
				System.out.print(temp+" ");
			}			
			temp++;
		}
	}
	 
	

}
