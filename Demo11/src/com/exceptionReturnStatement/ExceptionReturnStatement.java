package com.exceptionReturnStatement;

 

public class ExceptionReturnStatement 
{
	public static void main(String[] args)
	{
		
		int a=main();
		System.out.println(a);
	}

static	int main()
	{
		try 
		{
			System.out.println("try");
			return 0;
		}
		catch(Exception e)
		{
			System.out.println("catch");
			return 1;
		}
		finally
		{
			System.out.println("return");
			return 2;
		}
	}
}
