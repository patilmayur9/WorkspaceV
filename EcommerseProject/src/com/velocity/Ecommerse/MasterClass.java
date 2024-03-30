/*/===========================================Project Ecommerse (Shopping Mall)===============================================//
 
================================================== GROUP P====================================================================//
Project Participent:- 1. Mayur Patil                                       Technology We Used:- JDBC,MYSQL,CORE JAVA     
                      2. Pratik Sonawane
                      3. Mohd Ezaz
                      4. Ravindra Palaskar

//Core JAVA Concept We Used:- Exception Handling, Properties File, Collections, Loops, Methods, Interface, Switch Case:
                              Strings Custom Exception;
//===========================================================================================================================//
*/
// Admin Login Details:- Username:- root Password:- Admin@1234

// =================================================Main Calss (Master Class)===============================================//
// ===We have Provided Separate Pages for Admin  and User===================================================================//
// ===Username and Passord for admin will accessed from Properties File=====================================================//
// === Class Designed By:- Mohad Ezaz

package com.velocity.Ecommerse;

import java.util.Scanner;

public class MasterClass // Main Class
{
	public static void main(String[] args) // Main Method
	{

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"==============================================================================================================================================");
		System.out.println(
				"                                          E-commerce Project is Designed and Developed by ( GROUP P)                                          ");
		System.out.println(
				"==============================================================================================================================================");
		System.out.println(
				"================================================= WELCOME TO SHOPPING MALL====================================================================\n");
		System.out.print("1.Admin Login Page              \t 2.User Home Page              \t 3. Exit");
		System.out.println("\n");
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();

		AdminLogin adminlogin = new AdminLogin(); // Created object of AdminLogin to call the method in switch case
		UserView userview = new UserView(); // Created Object of UserView to call the method in switch case

		switch (ch) {
		case 1: {
			System.out.println("===========================================");
			System.out.println("        Welcome to Admin login             ");
			System.out.println("==========================================\n");
			adminlogin.aLogin(); // Admin login Page will open when option 1 will select
			break;
		}
		case 2: {
			System.out.println("==============================");
			System.out.println("       User Home Page         ");
			System.out.println("==============================");
			userview.userHomePage(); // User HomePage will be open when Option 2 will select.
			break;
		}
		case 3: {
			System.out.println("=================================================");
			System.out.println("  Thanks for coming..!! Please visit again..!!   ");
			System.out.println("=================================================\n");
			System.exit(0); // System.exit method call for Exit from Choise Option
			break;
		}
		default: {
			System.out.println("Invalid Choice");
			break;
		}

		}

	}

}
