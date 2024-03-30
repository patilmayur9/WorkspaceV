//======================================================User Registration Class===================================================//

// Class Designed By :- Mayur Patil
// After Selecting User Registration Option Control will Redirected to this Page /Class
// 1. Take input from User for Registration 
// 2. Store This values into Variable
// 3. Validation for Duplicate username
// 4. Validation for Duplicte mail Id
// 5. Validation for Dulicate Mail ID    ( User cant Register with Existing Mail ID, Mobile No and Usename)
// 6. After Successful Registration You will Redirect to User Home Page
// 7. User Login Method is written in this class Which will able to fetch username and password from table and match with UserInput
// 8. If UserName and Password Correct Then User can login and Buy the Product

//==================================================================================================================================//

package com.velocity.Ecommerse;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

	Scanner sc = new Scanner(System.in);
	static String uName;

	public void userRegistration() {

		String uContact;
		String uMail;

//==========================Take Input from User for Registration and Store into Varaiable============//

		System.out.println("Enter User Deatils for Registration \n ");

		System.out.println("Enter User First Name : ");
		String fName = sc.next();

		System.out.println("Enter User Last Name : ");
		String lName = sc.next();

		System.out.println("Enter User Address  : ");
		String uAddress = sc.next();

		System.out.println("Enter User Pincode  : ");
		String uPincode = sc.next();

//=====================for avoid duplication of contact code we use Arraylist=========================// 

		ArrayList<String> al = new ArrayList<String>();

		int count;
		do {
			count = 0;
			System.out.println("Enter User Contact number : ");
			uContact = sc.next();

			try {
				Connection conn1 = DatabaseConnection.getConnection();
				PreparedStatement ps = conn1.prepareStatement("select Contact from userRegistration");
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					al.add(rs.getString(1));
				}
			} catch (Exception e1) {
				System.out.println(e1);
			}

			for (int i = 0; i < al.size(); i++) {
				if (uContact.equals(al.get(i))) {
					count++;
					System.err.println("Contact is Al-ready Exist please Enter new Contact Number");
				}
			}
		} while (count == 1);

//=================for avoid duplication of mail id code===========================================//

		ArrayList<String> al1 = new ArrayList<String>();

		int count1;
		do {
			count1 = 0;
			System.out.println("Enter User Mail Id : ");
			uMail = sc.next();

			try {
				Connection conn1 = DatabaseConnection.getConnection();
				PreparedStatement ps = conn1.prepareStatement("select MailId from userRegistration");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					al1.add(rs.getString(1));
				}
			} catch (Exception e1) {
				System.out.println(e1);
			}

			for (int i = 0; i < al1.size(); i++) {
				if (uMail.equals(al1.get(i))) {
					count1++;
					System.err.println("Mail Id is Allready Exist please Enter new  Mail Id");
				}
			}
		} while (count1 == 1);

//=======================for avoid duplication of user name  code===========================================//

		ArrayList<String> al2 = new ArrayList<String>();

		int count2;
		do {
			count2 = 0;
			System.out.println("Enter UserName : ");
			this.uName = sc.next();

			try {
				Connection conn1 = DatabaseConnection.getConnection();
				PreparedStatement ps = conn1.prepareStatement("select UserName from userRegistration");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					al2.add(rs.getString(1));
				}
			} catch (Exception e1) {
				System.out.println(e1);
			}

			for (int i = 0; i < al2.size(); i++) {
				if (uName.equals(al2.get(i))) {
					count2++;
					System.err.println("Username is Al-ready Exist please Enter new User Name ");
				}
			}
		} while (count2 == 1);

//============================================= Enter Password and Store into Variable=================	=====     

		System.out.println("Enter Password : ");
		String uPassword = sc.next();

//====================================================== Datase Coonection code for Insert Query=============
// Insert all data into User Registration Table After Validation	

		Connection conn = DatabaseConnection.getConnection();
		try {
			PreparedStatement ps1 = conn.prepareStatement(
					"insert into userRegistration(FirstName,LastName,Address,Pincode,Contact,MailId,UserName,Password)values(?,?,?,?,?,?,?,?)");

			ps1.setString(1, fName);
			ps1.setString(2, lName);
			ps1.setString(3, uAddress);
			ps1.setString(4, uPincode);
			ps1.setString(5, uContact);
			ps1.setString(6, uMail);
			ps1.setString(7, uName);
			ps1.setString(8, uPassword);

			ps1.executeUpdate();
			System.out.println(" \n ==Congratulation..!!Registration Successful=== \n ");

			conn.close();
			ps1.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

		UserView userview = new UserView();
		userview.userHomePage();
	}

// User Login Method will Fetch UserName and Password from User Registration Table and Stored Into Variable

	public void userLogin() {
		System.out.println("Please Enter your Login Details( Username and Password) \n");

		ArrayList<String> alUName = new ArrayList<>(); // One ArrayList for UserName
		ArrayList<String> alUPass = new ArrayList<>(); // One ArrayLIst for Password

		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select UserName,Password from userRegistration");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				alUName.add(rs.getString(1)); // all username are added into Array list
				alUPass.add(rs.getString(2)); // all passwords are added into Array list
			}

			conn.close();
			rs.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// =========== Code for valid username matching==============================

		int count;
		do {
			count = 0;
			System.out.println("Enter User name : "); // User will Enter username
			uName = sc.next();
			for (int i = 0; i < alUName.size(); i++) // for Loop will check this username with all Avaialable username
														// into Table
			{
				if (uName.equals(alUName.get(i))) // If condition for Coampar usename and If match found count will
													// increase
				{
					count++;
				}
			}

		} while (count == 0);

		// =================================Code for valid Password matching============
		int count1;
		do {
			count1 = 0;
			System.out.println("Enter Password : "); // User Will Enter Password
			String password = sc.next();

			for (int i = 0; i < alUPass.size(); i++) // For Loop Will check with Password Stored into Database
			{
				if (password.equals(alUPass.get(i))) // If condition will compare the Password
				{
					count1++;
				}
			}

		} while (count1 == 0);

		System.out.println("Congratualtion Login successful \n");
		// If User Name and Password Match then User can See the Product and Start the
		// Buying

		ProductShow productShow = new ProductShow();
		productShow.productDetails();

	}

}
