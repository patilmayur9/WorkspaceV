package com.stringOperation;

import java.util.Scanner;

public class StringAlphabateNumVowels 
{
	  int vowels;
	 int alphabate;
	 int number;
	 //int other;
	 //int specialSymbols;
	 
	@Override
	public String toString() {
		return "StringAlphabateNumVowels [vowels=" + vowels + ", alphabate=" + alphabate + ", number=" + number + "]";
			//	+ ", other=" + other + "]";
	}

	public static void main(String[] args)
	{
		StringAlphabateNumVowels stringalphabatenumvowels=new StringAlphabateNumVowels();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any String you have without space  ");
		String str=scanner.nextLine();
		System.out.println(str.length());
		Object o=stringalphabatenumvowels.countAlphabateNumberVowels(str);
		
		System.out.println(o);//printing the object instance values using overriding toString()
 
	}	 

	  public  StringAlphabateNumVowels countAlphabateNumberVowels(String str)//Return type this method is class so we can return the this class object
	  {
		StringAlphabateNumVowels stringalphabatenumvowels=new StringAlphabateNumVowels();//hear we create object of class
		   		
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				stringalphabatenumvowels.vowels++;
			}
			else if(ch>=48 && ch<=57)
			{
				stringalphabatenumvowels.number++;
			} 
			else if( (ch>=65 && ch<=90) || (ch>=97 && ch<=122) )
			{ 
				stringalphabatenumvowels.alphabate++;
			}
			
			else
			{
				 System.out.println();
			}			
		}		 
		return stringalphabatenumvowels;//returning the class object
	  }
	 
}
