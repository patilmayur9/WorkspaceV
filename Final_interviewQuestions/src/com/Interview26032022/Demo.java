//paresh wadekar sir 26.03.2022 collection and progrma pracitce and communication 
package com.Interview26032022;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any String  ");
		String str=sc.nextLine();   
		System.out.println("before Split string "+str);
		String temp[]=str.split(" ");  
		 
		for (int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]+" ");
		 
		}
	} 
}


/*String s1="paresh";
String s2="paresh";
String s3=new String("paresh");
String s4=new String("paresh");

System.out.println( s1==s2);//true
System.out.println( s2==s3);//false
System.out.println( s1==s4);//false
System.out.println( s1.equals(s2));//true
System.out.println( s2.equals(s3));//true
System.out.println( s4==s2); //false
System.out.println(s3.equals(s4));//true
*/
