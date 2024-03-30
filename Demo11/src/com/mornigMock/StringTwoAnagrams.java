//Java Program to determine whether two strings are the anagram
package com.mornigMock;

import java.util.Arrays;
import java.util.Scanner;
 

public class StringTwoAnagrams 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String ");
		String str1=sc.nextLine();
		System.out.println("Enter Second String ");
		String str2=sc.nextLine();
		
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		str1.toLowerCase();
		str2.toLowerCase();
		if(str1.length() == str2.length() )
		{
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			 Arrays.sort(ch1);
			 Arrays.sort(ch2);
			 
			 if(ch1.length==ch2.length)
			 {
				 System.out.println("Given Strings are Anagrams ");
				 
			 }
			 else
			{
				System.out.println("Given Strings are not Anagrms ");
			}
			 
		}
		else
		{
			System.out.println("Given Strings are not Anagrms ");
		}
		
	}
}
