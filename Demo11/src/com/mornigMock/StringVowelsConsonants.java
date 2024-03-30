//Java Program to count the total number of vowels and consonants in a string
package com.mornigMock;

import java.util.Scanner;

public class StringVowelsConsonants
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String ");
		String str=sc.nextLine();
		
		char ch;
		int vowels=0,consonants=0;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		System.out.println("In given String Vowels are "+vowels);
		System.out.println("In given String consonants are "+consonants);
		
	}

}
