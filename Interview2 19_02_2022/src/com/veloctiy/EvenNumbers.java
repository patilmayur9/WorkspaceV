package com.veloctiy;
import java.util.Scanner;

public class EvenNumbers 
{
	public static void main (String args[])
	{
	Scanner scanner=new Scanner(System.in);
	EvenNumbers evennumbers=new EvenNumbers();
	
	System.out.println("Enterr the range for even numbers : ");
	int i=scanner.nextInt();
	evennumbers.getEvenNumbers(i);
	
	}
	void getEvenNumbers(int i)
	{int d=i;
		System.out.println("Even numbers of given range is : ");
		int temp=0;
		while(temp<d)
		{
			if(temp%2==0)
			{
				System.out.println("even"+temp);
			}
			else
			{
				System.out.println("Odd"+temp);
				
			}
			 
			
			temp++; 
		}
		
//		System.out.println("Odd numbers of given range is : ");
//		
//		while(temp<d)
//		{
//			System.out.println("dddd");
//			if(temp%2==0)
//			{
//				
//			}
//			else
//			{
//				System.out.println(temp);
//			}
//			temp++;
//		}
	}
}
