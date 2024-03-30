package com.constructor;

import java.util.Scanner;

public class PrimeNumberOfGivenRange 
{
	 public static void main (String args[])
	{
	Scanner sc=new Scanner(System.in);// TODO Auto-generated method stub
	System.out.println("Enter Range : ");
	int range=sc.nextInt();
	
	int count=1;
	int temp=1;
	  
	while(temp<=range)//1<=10
	{
		for(int i=1;i<=temp;i++)//1<=1
		{
			if(temp%i==0)//1%1==0
			{
				count++;//2
			}			 
		}		
	 	if(count==2)
			System.out.print(" "+temp);
	temp++;
	}
	
	}

}
