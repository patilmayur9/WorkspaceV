package com.stringOperations;

public class StirngReverse 
{
	public static void main(String[] args) 
	{
		String str="Abhijit";
		for(int i=str.length()-1;i>=0;i--)
		{
			char ch;
			ch=str.charAt(i);
			System.out.print(ch);
		}
	}
}
