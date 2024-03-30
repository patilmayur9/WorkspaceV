package com.interview;

import java.util.Scanner;

public class StringReverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String : ");
		String str=sc.nextLine(); 
		
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			temp=str.charAt(i)+temp;
				
		}
		System.out.println("Reversed String is : "+temp);
	}
}

/*StringBuffer sb=new StringBuffer(str);
sb.reverse();
System.out.println(sb);*/
