package com.returnStatementScenario;

public class ReturnInMethod
{
	public static void main(String[] args)
	{
		System.out.println(m1());
	}
	public static  int m1()
	{/*
		try 
		{
			return 30;
		
		}
		catch(Exception e)
		{
		// return 40;
		}
		finally
		{
			//return 50;
			
		}
		 return 55;
		//System.out.println("mayur");
//		 return 60;
*/	
		if(0==0)
		{
			return 30;
		}
		else
		{
			return 50;
		}
		
		//return 40;
		
	}

}
