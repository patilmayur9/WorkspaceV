package com.exceptionReturnStatement;

public class TryCatchRetrunStatement
{
	public static void main(String[] args)
	{
		System.out.println(checkException());
	}
	
	public static int checkException()
	{
		try
		{
			System.out.println("in Try block");
			
			System.out.println(10/0);
			return 10;
		}
		catch(Exception e)
		{
			System.out.println("in catch block");
			return 20;
			 
		}
		finally
		{
			System.out.println("in finally block");
			
			return 30;
		}
		 
	}
}
