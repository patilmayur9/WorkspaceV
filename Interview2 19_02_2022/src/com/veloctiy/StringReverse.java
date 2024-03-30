package com.veloctiy;

import java.util.Scanner;

public class StringReverse 
{
	public static void main(String[] args)
	{ 
		String str,temp="";
		char ch;

		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter The String : ");
		 str=scanner.next();
		 
		 for (int i=0;i<str.length();i++)
		 {
			 ch=str.charAt(i);
			 temp=ch+temp;
			 
		 }
		
		 System.out.println("Reverse String is : "+temp);
	}
}
