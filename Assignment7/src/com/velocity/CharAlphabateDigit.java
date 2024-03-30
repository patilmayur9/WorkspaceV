/*Design method to check whether the character is alphabet, digit and special symbol.
 * ( Hint: char can be stored as int and you have ASCII table from lec04)*/
package com.velocity;
import java.util.Scanner;

public class CharAlphabateDigit 
{
	public static void main (String args[])
	{
		System.out.println("Enter the any Key on keybord : ");//0
		
		Scanner scanner=new Scanner(System.in);
		int key=scanner.next().charAt(0); // A==65
		 
		
			if(key>=48 && key<=57)
			{
				char c=(char)key;
				System.out.println("You Enterd a Number : "+ c +" And it's ASCII value is : " +key);
			}
			else if(key>=65 && key<=90)
			{
				char c=(char)key;  // char c= (char)key 65
				System.out.println("You Enterd a Uppercase Alphabate : "+c+" And it's ASCII value is : " +key);
			}
			else if(key>=97 && key<=122)
			{
				char c=(char)key;
				System.out.println("You Enterd a Lovercase Alphabate : "+c+" And it's ASCII value is : " +key);
			}
			else if(key>=33 && key<=47)
			{
				char c=(char)key;  
				System.out.println("You Enterd a Specail Symbol : "+c+" And it's ASCII value is : " +key);
			}
			else
			{
				char c=(char)key;
				System.out.println("Entered character is not in our list : "+c+" And it's ASCII value is : " +key);
			}
	}
}