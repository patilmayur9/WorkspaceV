package com.velocity.exception;

import java.util.Scanner;

public class MainProduct 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Product Weight : ");
		int weight = scanner.nextInt();
		
		Product product=new Product();
		product.productCheck(weight);
		
		
	}

}



























/*package com.velocity.exception;

public class MainProduct {
public static void main(String[] args) {
Account account = new Account();
System.out.println("Current balance : " + 
account.balance());
account.withdraw(3500);
System.out.println("Current balance : " + 
account.balance());
}
}*/