package com.velocity.ECommerce;

import java.util.Scanner;

public   class AdminView 
{	 
	public void AdminHomeTab()
	{
		System.out.println("\t\t\t\t\t\t\t-:Admin Home Page:-");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Insert Product Details \t 2.Check Prdoduct Quantity \t 3.Registered User List \t 4. Check Perticular User History \t 5. Exit");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int ch=sc.nextInt();
		InsertProductDetails insertProductDetails=new InsertProductDetails();
		switch(ch)
		{
			case 1:
			{
				System.out.println("Insert Product Details");
				insertProductDetails.insertProduct();
				break;
			}
			case 2:
			{
				System.out.println("Check Prdoduct Quantity");
				 
				break;
			}
			case 3:
			{
				System.out.println("Registered User List");
				 
				break;
			}
			case 4:
			{
				System.out.println("Check Perticular User History");
				PerticularUserHistory.userHistory();
				System.out.println("in switch case 4");
				break;
			}
			
			case 5:
			{
				System.exit(0);
				break;
			}
			
		} 
	}
}
