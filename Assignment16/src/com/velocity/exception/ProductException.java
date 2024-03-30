package com.velocity.exception;
//package com.velocity.exception;

public class ProductException extends RuntimeException 
{
	
	private String message; 
	public ProductException(String message)
	{	 
		 super(message);
		 //hear we call the toString() by default overriden method of RuntimeException class using super() keyword
	}
}




































/*package com.velocity.exception;
public class InsufficientFundException extends
RuntimeException
{
private String message;
public InsufficientFundException(String message) 
{
//this.message = message;
super(message);
}
}*/
