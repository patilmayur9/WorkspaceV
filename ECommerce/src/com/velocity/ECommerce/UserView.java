package com.velocity.ECommerce;

import java.util.Scanner;

public class UserView
{
	public static void userHomePage()
	{
		System.out.println("\t\t\t\t\t\t\t-:User Home Page:-");
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Register User \t 2.User Login \t 3.Check Products  \t 4. Exit");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int ch=sc.nextInt();
		InsertProductDetails insertProductDetails=new InsertProductDetails();
		User user=new User();
		switch(ch)
		{
			case 1:
			{
				System.out.println("welcome to User Registration Page");
				user.userRegistration();
				break;
			}
			case 2:
			{
				System.out.println("Welcome to User Login Page");
				user.userLogin();
				break;
			}
			case 3:
			{
				System.out.println("Product List");
				 ProductShow.CheckProducts();
				break;
			} 
			case 4:
			{
				System.exit(0);
				break;
			}
			
		} 

	}

}
