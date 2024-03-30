/*Account
int : accountNumber
String: accountName
void :getAccountDetails()
void: getAccountInformation()
*/
package com.velocity.singaleInheritance;
import java.util.Scanner;
public class Account
{
	  int  accountNumber;
	  String accountName;
	

	          
	void getAccountDetails()
	{
		Scanner scanner=new Scanner(System.in);  
		
		System.out.println("Enter Account Holder name : ");
		accountName=scanner.next();
		System.out.println("Enter Account Number : ");
		accountNumber=scanner.nextInt();
		getAccountInformation(accountName,accountNumber);
		
	}
	void getAccountInformation(String accountName,int accountNumber)
	{
		System.out.println("Account Holder name : "+accountName); 
		System.out.println("Account Number is : "+accountNumber);
		 
	}


}
