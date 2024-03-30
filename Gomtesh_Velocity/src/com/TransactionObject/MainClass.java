package com.TransactionObject;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	static int  customerId;
	static int transactionAmount;
	static int debit;
	static int credit;
	public static void main(String[] args) {
	//	TransactionObject to[]=new TransactionObject [5]; 
		ArrayList<Object> al=new ArrayList<>();
		//to.[0]=new TransactionObject(1, 2, 20, 40);
		
		System.out.println("Entr how many customer information you want to Enter : ");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		for (int i = 1; i <=range; i++) 
		{
			System.out.println("Enter customer details Id TransactionAmount Debit Credit for custmoer "+i);
			customerId=sc.nextInt();
			transactionAmount=sc.nextInt();
			debit=sc.nextInt();
			credit=sc.nextInt();
			al.add(new TransactionObject(customerId, transactionAmount, debit, credit));						
		}
		System.out.println(al);
		
				
		System.out.println(" ");
		
	}

}
