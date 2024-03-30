package com.tryCatch;

public class Demo {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("1");
			int i = 10 / 0;//hear exception will be occured and this exception will not be handled so abnormaly termination done by jvm
		}
		catch (NullPointerException e)
		{
			System.out.println("2");
			try
			{
				System.out.println("3");
				int i = 20 / 0;
			} 
			catch (ArithmeticException e1) //heare we cannot use e local variable because already e is used in catch use diff variable
			{
				System.out.println("4");
				e.printStackTrace();
			}
		}
	}
}