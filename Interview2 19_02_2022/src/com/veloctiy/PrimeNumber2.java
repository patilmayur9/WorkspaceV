package com.veloctiy;

import java.util.Scanner;

public class PrimeNumber2 
{

	
	//Prime number program
	//import java.util.Scanner;
	//public class Prime2
	//{
public static void main(String[]args) 
{
	 int n1 ,count=0;
	 System.out.println("Enter any number");
	 Scanner r= new Scanner(System.in);
	 n1=r.nextInt();
	 int n=1;
while(n<=n1)
{
	 for(int i=1;i<=n;i++)
	 {
		 if(n/i==0)
		 {
			 count++;
		 }
	 }
	 if(count==2)
	 {
		 System.out.println("it is Prime number");
	 }
	 else
	 {
		 System.out.println(" it is a not Prime number");
	 }
	 
	 n++;
}
}
}
