package com.serilization;

import java.util.Scanner;

public class FcatorialTwoNumber 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First number m : ");
		int m=sc.nextInt();
		
		System.out.println("Enter the Second number n : ");
		int n=sc.nextInt();
		
		if(m>n)
		{
			FcatorialTwoNumber fcatorialtwnoumber=new FcatorialTwoNumber();
			
			System.out.println("Factorial is :"+fcatorialtwnoumber.fatorial(m,n));
		}
		else
		{
			System.out.println("M number is smaller than N number ");
		}
		
	}
	
	public int fatorial(int m, int n)
	{int temp=1;
		while(m!=0)
		{
			temp=temp*m;
			m--;
			
		}	
		//System.out.println(temp);
		
		int temp1=1;
		while(n!=0)
		{
			temp1=temp1*n;
			n--;
			
		}
		//System.out.println(temp1);
		//System.out.println(temp1/temp);
		return (temp/temp1);
		 
		
	}

}
