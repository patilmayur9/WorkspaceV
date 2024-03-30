package com.factoryDesignePattern;

public class FactoryMethod {
	
	public static Booking getTicket(String abc)
	{
		if(abc.equals("1Tear"))
		{			 
			return  new Tear1();
		}
		else if(abc.equals("2Tear"))
		{ 
			return   new Tear2();
		}
		else if(abc.equals("3Tear"))
		{		 
			return new Tear3();
		}
		 
			throw new  IllegalArgumentException("Invalid Input Please Enter Valid Input......");
		 
	}

}
