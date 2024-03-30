package com.veloctiy;

import java.util.Scanner;

public class FibonacciSeries 
{
	  int a=0;
	  int b=1;
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		FibonacciSeries fibonacciseries=new FibonacciSeries();
		
		System.out.println("Enter the range of Fibonacci Series : ");
		
		int a=scanner.nextInt();
		System.out.print("The Fibonacci series of given number is : "+ fibonacciseries.a +" "+fibonacciseries.b +" "  );
		
	
		fibonacciseries.getFebonacciSeries(a);
		
	}
	void getFebonacciSeries(int range)
	{
		int temp=0;
		for(int i=2;i<=range;i++)
		{
			a=a+b;
			System.out.print(a+" ");
			temp=a;
			a=b;
			b=temp;
			
		}
		
	}

}
