package com.stringOperations;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String str=sc.next();
		String str1="";
		char ch;
		for(int i=str.length()-1 ;i>=0 ;i--)
		{
			System.out.print(str.charAt(i));
		}
				
	}

}
