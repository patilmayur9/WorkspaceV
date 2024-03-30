/*2.
2.1 Design the Account class which contain id, accountNumber and balance.
Design another class called as SavingAccount extends Account that contain withdrawAmount. 
Design class AccountDetails class in which below methods. 
Public void getAccountDetails () 
public static int getWithdrawDetails(Account account) 
*/
package com.velocity.policy;

import java.util.Scanner;

public class SavingAccount  extends Account
{
	
	private int withdrawAmount;
	
	//public setter and getter method for encapsulation
	public int getWithdrawAmount()
	{
		return withdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount)
	{
		this.withdrawAmount=withdrawAmount;		
	}
}
