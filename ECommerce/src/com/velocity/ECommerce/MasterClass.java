package com.velocity.ECommerce;

import java.util.Scanner;

public class MasterClass   
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("1. Admin Login \t 2.User Home Page \t 3. Exit");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int ch=sc.nextInt();
		 
		AdminLogin adminlogin=new AdminLogin();
	
		switch(ch)
		{
			case 1:
			{
				System.out.println("welcome to Admin login ");				
				adminlogin.aLogin();
				break;
			}
			case 2:
			{
				System.out.println("welcome to User Home Page ");
				UserView.userHomePage();
				break;
			}
			case 3:
			{ 
				System.exit(0);
				break;
			}
			case 4:
			{
				System.out.println("Invalid Choice");
			}
			
		} 
		
	}
 
}
