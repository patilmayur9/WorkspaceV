/*2.
2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 
*/
package com.velocity.policy;
import java.util.Scanner;


public class Account
{
	private int id;
	private int accountNumber;
	private int balance;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;		
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;		
	}
	
	public int getBalance()
	{
		return balance;
	}
	public void setBalance(int balance)
	{
		this.balance=balance;		
	}
	
	 
	public Account(int id, int accountNumber,int balance)
	{
		this.id=id;
		this.accountNumber=accountNumber;
		this.balance=balance;
	}
	public Account() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountNumber=" + accountNumber + ", balance=" + balance + "]";
	} 
	 
	
 

}
