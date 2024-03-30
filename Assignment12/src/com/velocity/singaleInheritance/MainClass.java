package com.velocity.singaleInheritance;

public class MainClass
{
	 
	public static void main (String args[])
	{
		SavingAccount savingaccount=new SavingAccount();
		
		//calling parent class(Account) method
		savingaccount.getAccountDetails(); 
		//savingaccount.getAccountInformation(); //this is also valid and you can call this method in to getAccountDetails method and pass the variables to getaccountinformation method
		
		//calling child class(SavingAccount) method
		savingaccount.getSavingAccountDetails();  
		//savingaccount.getSavingAccountInformation(); 
		
		System.out.println("Are you in main method");
		
	}
	 
}
