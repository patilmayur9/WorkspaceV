package com.mornigMock;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagrams
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String : ");
		String str=sc.nextLine();
		
		System.out.println("Enter 2nd String : ");
		String str1=sc.nextLine();
		
		str=str.replaceAll("\\s", "");
		str1=str1.replaceAll("\\s", "");
		
		str=str.toLowerCase();
		str1=str1.toLowerCase();
		
		if(str.length() ==  str1.length())
		{
			char ch[]=str.toCharArray();
			char ch1[]=str1.toCharArray();
			
			Arrays.sort(ch);			
			Arrays.sort(ch1);
			
			boolean result=Arrays.equals(ch1,ch);
			
			if(result)
			{
				System.out.println("Strings are anagrams : ");				
			}
			else
			{
				System.out.println("Strings are not anagrmas");
			}
			
			
			
		}
		else
		{
			System.out.println("Strings are not anagrams : ");
		}
		
	}

}
