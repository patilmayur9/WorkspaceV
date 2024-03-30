/*1. Design the interface which contain below method public void getSavingAccount();
public void getUserDetails(String name,float balance); Then design the new class called as 
AccountImpl and implement that method, below input should be taken from user as name 
and balance into getSavingAccount method and pass input and print it into getUserDetails method. */
package com.veloctiy;

import java.util.Scanner;

public class AccountImpl implements interface1
{
	public void getSavingAccount()
	{
		System.out.println("Enter user Information");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter User Name  : ");
		String name=scanner.next();
		
		System.out.println("Enter User Account Balnce : ");
		float balance=scanner.nextFloat();
		
		getUserDetails(name,balance);//passing parameters to the getuserdetails method (method to method pass)
		
	}

	@Override
	public void getUserDetails(String name, float balance)
	{
		// TODO Auto-generated method stub
		System.out.println(" User Details are : ");
		System.out.println("User Name is : "+name);
		System.out.println("User Account Balnce is  : "+balance);
		
		
	}
	
		

}
