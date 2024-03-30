/*Java Program to determine whether two strings are the anagram
 * ..............
 * Two strings are called anagrams if they contain same set of characters
 *  but in different order.
 *  
 *  "keep ? peek", "Mother In Law - Hitler Woman".
 *  */ 
/*	1to remove all space  replcaceAll()
 * 2 convert into lowerCase()
 * 3 convert into ch= str.toCharArray()
 * 4 sort the array Array.sort(ch)	
 * 5 check the length of array in if
 * 6. then check Array.equals(ch,ch1)
 * 
*/	
package com.mornigMock;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramsStrings 
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the First String : ");
			String srt=sc.nextLine();
			
			System.out.println("Enter the Second String : ");
			String srt1=sc.nextLine();
			
//			System.out.println(srt);
//			System.out.println(srt1);
			 
			srt=srt.replaceAll("\\s", "");//removing all space inbetween String
			srt1=srt1.replaceAll("\\s", "");
			/*System.out.println(srt);
			System.out.println(srt1);*/
			
			
			srt=srt.toLowerCase();
			srt1=srt1.toLowerCase();
//			System.out.println(srt);
//			System.out.println(srt1);
			
			 
			if(srt.length()==srt1.length())
			{
				 
				char ch [] = srt.toCharArray();//convert the String into array
				char ch1[] =srt1.toCharArray();
				
				Arrays.sort(ch);//sort the both array if the sorted both are equal then strings are anagrams
				Arrays.sort(ch1);
				/*for (int i = 0; i < ch.length; i++)//printing array ch
				 *  {
			         System.out.print(ch[i] + " ");
			      	}
				
				for (int i = 0; i < ch1.length; i++)
				 	{ 
			         System.out.print(ch1[i] + " ");
			      	}*/
			 
			 boolean result=Arrays.equals(ch, ch1);
			if( result)
			{
				System.out.println("Given Strings are Anagrams : ");
				
			}
			else 
			{
				System.out.println("Strings are not Anagrams... ");
			}
				
			}
			else
			{
				System.out.println("Strings are not Anagrams ");
			}
			
		}

}


































	/*public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First String : ");
		String string11=sc.nextLine();
		String string1 = string11.replaceAll("\\s", "");//it removes the Space in between given String
		 
		
		System.out.println("Enter Second String : ");
		String string22=sc.nextLine();
		String string2 = string22.replaceAll("\\s", "");//it removes the Space in between given String
		// System.out.println(string1.length());
		System.out.println(string11.equalsIgnoreCase(string22));
		anagrams(string1,string2 ,string11,string22) ; 
		
	}
	
	public static void anagrams(String str,String str1, String string11,String string22)
	{ 
		int strLength=str.length();
		int str1Length=str1.length();
		char ch[]=new char[str.length()];
		char ch1[]=new char[str1Length];
		
		//System.out.println(str);
		char charAt;
		for (int i=0;i<str.length();i++)
		{
			 
			charAt=str.charAt(i); 
			if( (charAt>=65 && charAt<=90) || (charAt>=97 && charAt<=122) )
			{
				ch[i]=charAt;
			}
			
		}
		
		for(int j=0;j<ch.length;j++)//Character array printing code
		{
			System.out.print(ch[j]+" ");
		}
		
	//	System.out.println("........................................................................");
		
		//System.out.println(str1);
		//charAt=' ';
		for (int i=0;i<str1.length();i++)
		{
			
			charAt=str1.charAt(i);
			if( (charAt>=65 && charAt<=90) || (charAt>=97 && charAt<=122) )
			{
				ch1[i]=charAt;
			} 
		}
		
		for(int j=0;j<ch1.length;j++)//Character array printing code
		{
			System.out.print(ch1[j]+" ");
		}
		 
		
		//System.out.println("...........................................................");
		String string1=new String(ch);//conveting the char array in to String 
		String string2=new String(ch1);
		char c,d;
		char temp=' ';
		int count=0;
		for(int i=0;i<string1.length();i++)
		{
			for(int j=0 ; j<string2.length() ; j++)
			{
				c=string1.charAt(i);
				d=string2.charAt(j);
				if(i==j )
				{
					ch1[j]=temp;
					count++;
				}
			}
		}
		//System.out.println(count);
		if (count==(ch1.length))
		{
			System.out.println("The given String  "+ string11 +" and "+ string22 +" are Anagrams Strings ");
		}
		else
		{
			System.out.println("The given String are not Anagrams String ");
		}
	}
*/

