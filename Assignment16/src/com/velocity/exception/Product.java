/*
1. Design the Product class in which design void productCheck(int weight) in check 
whether weight is less than 100, then throw the ProductException  with meaningful message. 
2. Design the ProductException class in which write custom exceptions.
3. Create MainProduct class in which pass the input to productCheck method with try and catch block
*/
package com.velocity.exception;

import java.util.Scanner;

public class Product 
{	 
	public void productCheck(int weight)
	{
		 
		if(weight<100)
			{
			throw new ProductException("Wight is Below 100...");
			}
		else {
			System.out.println("Product weight is : "+weight);
		}
		
		
//		System.out.println(10/0);
//		throw new ArithmaticException e
	}
}


























/*package com.velocity.exception;
public class Account {
private int balance = 3000;
 public int balance() {
 return balance;
 }
 public void withdraw(int amount) {
 if (amount > balance) 
 {
 throw new InsufficientFundException("... Insufficient balance in your account..");
 }
 balance = balance - amount;
 }
}*/