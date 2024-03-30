/* Write a java program to display the Fibonacci series up to given number. (Fibonacci series mean next number is the sum 
 * of previous two numbers for example 0,1,1,2,3,5,8,13,21,34,55 etc. If enter no as 5 then output is 0,1,1,2,3).*/
package com.velocity;
import java.util.Scanner;

public class FibonacciSeries 
{
	
	public static void main (String args[])
	{ 
		int n1=0,n2=1,n3,temp;
		
		Scanner scanner=new Scanner(System.in);
		FibonacciSeries fibonacciseries=new FibonacciSeries();
		
		System.out.println("Enter the range of fibonacci series : ");
		
		int num=scanner.nextInt();
		
		System.out.print(n1 +" "+ n2 +" ");
		
		for(int i=2;i<=num;i++)//2<=5//3<=5//4<=5//5<=5
		{
			n1=n1+n2;//0+1=1//1+1=2//2+3=5
			
			System.out.print(n1+ " ");//1//2//3//5
			
			temp=n1; //1//2//3
			
			n1=n2; //1//1//2
			
			n2=temp;//1//2//3
			
		}
		
	}

}
 