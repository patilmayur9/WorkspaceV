//============================================== Class:- Admin View Home Page======================================================//

// Designed By Mohad Ezaz
// After Successfully Login User will reach to this page and He got 4 Different Option
// 1. Insert Product into Product Table(Shopping Mall Visibility List)
// 2. Check the Quantity of Product in Stock by Giving the Id as Input to System
// 3. Check the List of all Registred User
// 4. Check the user Perticular History
//=====================================================================================================//

package com.velocity.Ecommerse;

import java.sql.SQLException;

import java.util.Scanner;

public class AdminView {
	public void AdminHomeTab() throws SQLException {
		System.out.println(
				"===============================================================Admin Home Page=============================================================================");
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"1. Insert Product Details \t 2.Check Product Quantity \t 3.Registered User List \t 4. Check Perticular User History \t 5. Exit");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();

		InsertProductDetails insertProductDetails = new InsertProductDetails(); // Created Object of Insert Poroduct
																				// Class
		CheckProductQty checkproductquantity = new CheckProductQty(); // Created Object of CheckProductQty Clss

		DispayUserList displayuserlist = new DispayUserList(); // Created Object of DisplayUserList Class
		UserHistory userhistory = new UserHistory(); // Created Object of User History Class

		switch (ch) {
		case 1: {
			System.out.println("========================");
			System.out.println(" Insert Product Details ");
			System.out.println("========================");

			insertProductDetails.insertProduct(); // By selecting Option one InsertProduct method will be called with
													// Object Reference
			break;
		}
		case 2: {
			System.out.println("========================");
			System.out.println(" Check Product Quantity ");
			System.out.println("========================");

			checkproductquantity.getQuantity(); // By Selecting This Option getQuanitity Method wil be called with
												// Object Reference

			break;
		}
		case 3: {
			System.out.println("========================");
			System.out.println("  Registered User List  ");
			System.out.println("========================");
			displayuserlist.getUserList(); // By Selecting This Option getUserList Method will be Called by Object
											// Reference
			break;
		}
		case 4: {
			System.out.println("=================================");
			System.out.println("  Check Perticular User History  ");
			System.out.println("=================================");

			userhistory.getUserList(); // By Selecting this Option getUserList method will be called from UserHistory
										// Class.
			break;
		}

		case 5: {
			System.out.println("===Thanks for Visiting===");
			System.exit(0); // System Exit
			break;
		}

		}
	}
}
