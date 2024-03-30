/*SavingAccount
String : accountType
long: balance
void :getSavingAccountDetails()
void: getSavingAccountInformation()*/
package com.velocity.singaleInheritance;

import java.util.Scanner;

public class SavingAccount extends Account 
{
	String accountType;
	long balance;

	void getSavingAccountDetails()
	{		
		Scanner scanner=new Scanner(System.in);
		SavingAccount savingaccount=new SavingAccount();
		
		System.out.println("Enter Account holder name : ");
		savingaccount.accountName=scanner.next();
		
		System.out.println("Enter The Account number : ");
		savingaccount.accountNumber=scanner.nextInt();
		
		System.out.println("Enter type of account : ");
		accountType=scanner.next();
		
		System.out.println("Enter Account Balnce of saving account : ");
		balance=scanner.nextLong();
		
		getSavingAccountInformation(savingaccount.accountName,savingaccount.accountNumber,accountType,balance);
		
	}
	void getSavingAccountInformation(String accountName,int accountNumber,String accountType,long balnce)
	{
		
		System.out.println("Account Holder name : "+ accountName); 
		System.out.println("Account Number is : "+ accountNumber);
		System.out.println("Account type is  : "+accountType);
		System.out.println("Account Balnce is : "+balance);
		 
		
	}

}

 