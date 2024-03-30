/*2.
2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 
*/
package com.velocity.policy;
import java.util.Scanner;


public class AccountDetails 
{

	public void getAccountDetails() 
	{
		Scanner scanner=new Scanner(System.in);
		Account account=new Account();
		
		System.out.println("Enter id : ");
		int id=scanner.nextInt();
		
		System.out.println("Enter Account Number : ");
		int accountNumber=scanner.nextInt();
		
		System.out.println("Enter Account Balance : ");
		int balance=scanner.nextInt();
		
		
		account.setId(id);
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);
		
		 
		
		getWithdrawDetails(account);
		
		
	}
	
	 

	private static int getWithdrawDetails(Account account) 
	{
		Scanner scanner=new Scanner(System.in);
		int currentBalnce=0;
		System.out.println("Enter Withdraw Amount : ");
		int withdrawAmount=scanner.nextInt();
		
		if(account.getBalance() > withdrawAmount )
		{
			currentBalnce = account.getBalance() - withdrawAmount;
			 
		}
		 	System.out.println("Your Account Balnce is : "+ withdrawAmount);
		
		
 
		
		return currentBalnce;
		
	}
}
