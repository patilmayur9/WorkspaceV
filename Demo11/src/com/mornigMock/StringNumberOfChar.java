// Java Program to count the total number of characters in a string
package com.mornigMock;

import java.util.Scanner;

public class StringNumberOfChar 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String ");
		String str=sc.nextLine();
		char ch;
		int count=0;
		// System.out.println('z'+'z');//ch=0 then it will print space
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if((ch>=65 && ch<=90) || (ch>=97 && ch<=122))
			{
				count++;
			}
		}
		System.out.println("The Total number of Characters in given string are :"+count);
		
	}

}
