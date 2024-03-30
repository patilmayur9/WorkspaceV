package com.stringOperations;

import java.util.Scanner;

public class StringWordSwap
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		  
		String first="", second="";
		char ch;
		int count=0 ,firatStringlength=0;
		for (int i=0;i<str.length();i++)
		{ 
			  ch=str.charAt(i);
			if( ch==' ')
			{	
				count ++;
				firatStringlength=i;
			}
		}
		 
		for(int i=0;i<str.length();i++)
		{
			ch=0;
			ch=str.charAt(i);
			if(i<= firatStringlength)
			{
				first=first+ch;
			}
			else 
			{
				second=second+ch;
			}				
		}
 	  System.out.println(second+" "+first);
	}

}
