package com.raviSirProgram;

import java.util.Scanner;

public class DuplicateCharacterFromString {

	public static void main(String[] args) {
		System.out.println("Enter the string ");
		Scanner scanner=new Scanner(System.in);
		String ch=scanner.nextLine();//mayur patil
		int count;
		 for(int i=0;i<ch.length();i++ )
		 {
			 count=0;
			 for(int j=i+1;j<ch.length();j++)
			 {
				 if(ch.charAt(i)==ch.charAt(j))
				 {					 
					count++;
					//System.out.println(ch.charAt(i));
				 }
			 }
			 if(count==1)
			 {
				 System.out.println( ch.charAt(i));
			 }
		 }
		 
	}
}
