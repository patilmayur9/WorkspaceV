//=======================================================User View Class======================================================//

// Class Designed By :- Pratik Sonawane
// After Selecting User Home Page Control will redirected to this Page/Class
// We have Provided 3 Options to USer
// 1. Registered User ( If User is Not Registred then He can Register on our portal by Selecting Option 1
//      (Provision Made:-  Note Only Registred user can buy the Product)
// 2. After Registration User can Login and Buy the Product
// 3. Check Product:- Without Registrauion user can see the Product.
// 4. Exit
//=============================================================================================================================//

package com.velocity.Ecommerse;

import java.util.Scanner;

public class UserView {
	public static void userHomePage() {
		System.out.println(
				"============================================================Welcome to USER HOME PAGE========================================================\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please select Option \n");
		System.out.println("1. Register User       \t 2. User Login      \t 3. Check Products List     \t 4. Exit ");
		System.out.println();
		System.out.println("Enter Your Choice : ");
		int ch = sc.nextInt();

		User user = new User();
		UserView userview = new UserView();

		switch (ch) {
		case 1: {
			System.out
					.println("======================================================================================");
			System.out
					.println("                           Welcome to User Registration Page                          ");
			System.out.println(
					"======================================================================================\n");
			user.userRegistration();
			break;
		}
		case 2: {
			System.out
					.println("======================================================================================");
			System.out
					.println("                              Welcome to User Login Page                              ");
			System.out.println(
					"======================================================================================\n");
			user.userLogin();
			break;
		}
		case 3: {
			System.out
					.println("======================================================================================");
			System.out
					.println("                                  Product List                                        ");
			System.out.println(
					"======================================================================================\n");
			ProductShow productshow = new ProductShow();
			productshow.showProduct();
			userview.userHomePage();

			break;
		}
		case 4: {
			System.out.println("Thanks.. Please visit Again..!!");
			System.exit(0);
			break;
		}

		}

	}

}
