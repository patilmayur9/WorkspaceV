/*Design the java method for String getReverseString(String reverse) and take the input from user
 *  into main method and pass to that method. Result will print into main method*/
package com.stringOperation;

import java.util.Scanner;

public class StringReverse
{
	public static void main(String[] args)
	{
		StringReverse stringreverse=new StringReverse();
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("Enter any String ");
		String str=sc.next();	 
		System.out.println("After reversing the String :  "+getReverseString(str));
		 
	}
	
	
	public static  String getReverseString(String reverse)
	{
		 
		 int length=reverse.length();
		 char charact;
		 String str="";
		  for(int i =0;i<reverse.length();i++)
		  {
			  charact=reverse.charAt(i);
			   str=charact+str;
		  }
		  		 
		return str;		
	}
	

}
