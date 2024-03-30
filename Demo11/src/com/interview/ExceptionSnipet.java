package com.interview;

public class ExceptionSnipet
{
	public static void main(String[] args) {
		try {
			System.out.println("1");
			int result=10/0;
		}
		catch (NullPointerException e)
		{
			System.out.println("2");
			System.out.println(e);
		}
		finally {
			System.out.println("finllay 1st");
		}
		try
		{
			System.out.println("3");
			int c=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("4");
			System.out.println(e);
			
		}
		catch(Exception e)
		{
		}
		finally {
			System.out.println("finllay 2st");
		}
		System.out.println("6");
	}

}
