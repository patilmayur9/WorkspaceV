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

public class PracticeAnagram
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first String ");
		String string1=sc.nextLine();
		System.out.println("Enter Second String ");
		String string2=sc.nextLine();
		
		//replace all spaces
		String	str1=string1.replaceAll("\\s", "");
		String str2=string2.replaceAll("\\s", "");
		
		//convert all String into lowerCase
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		//convert String into char by char in character array
		char str11[]=str1.toCharArray();
		char str22[]=str2.toCharArray();
		
		//sort the Array
		Arrays.sort(str11);
		Arrays.sort(str22);
		/*System.out.println(Arrays.toString(str11));
		System.out.println(Arrays.toString(str22));*/
		 
		if(str11.length==str22.length)
		{
			if(Arrays.equals(str11, str22))
			{
				System.out.println("The given Strings are Anagrams ");
			}
			else
			{
				System.out.println("Given Strings  "+string1+"  AND  "+ string2+"  are not Anagram ");
			}
			
		}
		else
		{
			System.out.println("Given Strings  "+string1+"  AND  "+ string2+"  are not Anagram ");
		}
		
		
	}
	
}
