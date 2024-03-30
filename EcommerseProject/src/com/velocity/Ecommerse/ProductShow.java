//===================================================PRODUCT SHOW CLASS=============================================================//

// Class Designed By:- Mayur Patil
// We have Implemented method into this Class which is Declared as Abstract in requirement Interface.
// 1.productDetails()         :- Dispaly the Product in Acending List
// 2.selectProduct()          :- Select the Product and Quantity for Buy ( Can Select the Multiple Product)
// 3.showProduct()            :- This method will show all the Products to user which is Available into Shopping Mall
// 4.EachUserCreateTable()    :- Create the Seprate cart table for each user ( Table name and User Name Should Be same) 
// 5.UserCartDataShow()       :- This Method will Show the Cart Table data to user.
// 6.Custome Exception        :- If User will try to Enter more Quantity than available Stock then Custome Exception will Through.
// 

//=====================================================================================================================================//

package com.velocity.Ecommerse;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductShow implements requirement {

	static int id, quant, pQuantity, n;
	static String pName, pDescription, pPrice;

	ArrayList<Integer> al = new ArrayList<Integer>(); // Used to Store the Product Id from Hashmap

	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();// hashmap is created for same product id and
																	// duplicate quantity entered multiple times

	Scanner sc = new Scanner(System.in);

//============================================================================================================
// This Product Details Method will show the Product in Decending Order
//============================================================================================================	

	@Override

	public void productDetails() {
		System.out.println("\n================Welcome to Product Details Page===============\n");
		System.out.println("If you Want to Disply Products Decending Order by it's Price  Then Press Y Else N");

		char choise = sc.next().charAt(0);

		Connection con = null;
		if (choise == 'Y' || choise == 'y') {
			System.out.println("========================Buy The Products =========================");

			DatabaseConnection DC = new DatabaseConnection();
			con = DC.getConnection();
			PreparedStatement ps = null;

			try {
				ps = con.prepareStatement("select * from Product  order by Price desc");

				ResultSet rs = ps.executeQuery();
				while (rs.next()) {

					// First It will check the if any Qty of Product is Zero
					// If any of Product Qty found Zero then it will Show the List with Out of Stock

					int a = rs.getInt(5);
					if (a > 0) {

						System.out.println("======================================");
						System.out.println("ProductId :-          " + rs.getInt(1));
						System.out.println("Name :-               " + rs.getString(2));
						System.out.println("Description :-        " + rs.getString(3));
						System.out.println("Price :-              " + rs.getString(4));
						System.out.println("Remaining Quantity :- " + a);
						System.out.println("\n");

					}

					else {
						System.out.println("======================================");
						System.out.println("ProductId :-          " + rs.getInt(1));
						System.out.println("Name :-               " + rs.getString(2));
						System.out.println("Description :-        " + rs.getString(3));
						System.out.println("Price :-              " + rs.getString(4));
						System.out.println("Out of Stock          " + a);
						System.out.println("\n");
					}

				}
				System.out.println("Successful");
			} catch (SQLException e) {
				System.out.println(e);
			} finally {
				try {
					con.close();
					ps.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		} else {
			System.out.println("\"========================Buy The Products ===========================\"");
			this.showProduct();// default product list will be displyed as it is from Product Table
		}
		this.selectProduct();
	}
//===========================================================================================================================//
// This selectProduct method will Select the Product from Product Show 
// Can Select The Multiple Product and Respective Qty for Each Product	
// Selected Qty will be be added into User Cart table which is dynamically created Runtime	
//==========================================================================================================================//	

	@Override
	public void selectProduct() {
		int tableQuantity, result;

		System.out.println("============= User can Buy Multiple Products================");
		System.out.println("=====================Select Product=========================");

		System.out.println("\nEnter How Many Product you Want to buy:-  ");
		n = sc.nextInt();// 3
		try {
			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement ps = null;

			int count = 0;
			for (int i = 0; i < n; i++) {
				count++;
				tableQuantity = 0;
				result = 0;

				System.out.println("Enter ProductId You Want to select :- ");
				id = sc.nextInt();// Product Id will be store into Hashmap as Key

				// =====================================================================================================================================
				// If Customer will Try to buy more Quantity than availabe Stock in Product
				// table Then Custome Exception will Throw for Valid Quantity
				// =====================================================================================================================================
				int num;
				do {
					num = 0;
					int quantity = 0;

					System.out.println("Enter Product Quantity You Want to buy :- ");
					quant = sc.nextInt();

					try {
						Connection conn1 = DatabaseConnection.getConnection();
						PreparedStatement ps1 = conn1
								.prepareStatement("select Quantity from product where ProductId= ?");
						ps1.setInt(1, id);
						ResultSet rs = ps1.executeQuery();

						while (rs.next()) {

							System.out.println("Available Qty in Stock = " + rs.getString(1));
							quantity = Integer.parseInt(rs.getString(1));// String to int convert or non primitive to
																			// primitive
						}
						if (quant > quantity || quant < 1)// 11>10 && 11<1
						{
							num++;
							throw new InvalidInput("Please give the valid Quantity..."); // Custome Exception for Valid
																							// Quantity
						}
					} catch (Exception e1) {
						System.out.println(e1);
					}

				} while (num == 1);

				// ============================================================================================================================

				hm.put(id, quant); // Put Method will Store Data into Hashmap (Product Id,Qty)

				String s1 = "select Quantity from product where ProductId=?;"; // Check Quanity From Product Table

				ps = conn.prepareStatement(s1);
				ps.setInt(1, id);
				ResultSet rs = ps.executeQuery();

				while (rs.next()) {
					tableQuantity = rs.getInt(1);
				}
				result = tableQuantity - quant; // Update the Quantity from Product table after Selection

				String s2 = "update product set Quantity=? where ProductId=?;";

				ps = conn.prepareStatement(s2);
				ps.setInt(1, result);
				ps.setInt(2, id);
				int l = ps.executeUpdate();

				if (n > 1) {
					this.showProduct(); // fresh data will be displyes after performing quantiy minus operation
				}
				if (count == 1) {
					ProductShow productshow = new ProductShow();
					productshow.EachUserCreateTable();
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}

//============================================================================================
		int key = 0;
		int value = 0;

		Iterator<Entry<Integer, Integer>> it = hm.entrySet().iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, Integer> pair = (Map.Entry) it.next();
			key = pair.getKey();
			value = pair.getValue();
			al.add(key);// adding id into array list

			Connection conn = DatabaseConnection.getConnection();
			PreparedStatement ps = null;
			try {
				ps = conn.prepareStatement("select * from product where ProductId=?");
				ps.setInt(1, key);
				ResultSet rs = ps.executeQuery();
				while (rs.next())// Name,Description,Price,Quantity
				{
					System.out.println("ProductId :-          " + rs.getInt(1));

					System.out.println("Name :-               " + rs.getString(2));
					pName = rs.getString(2);

					System.out.println("Description :-        " + rs.getString(3));
					pDescription = rs.getString(3);

					System.out.println("Price :-              " + rs.getString(4));
					pPrice = rs.getString(4);

					System.out.println("Remaining Quantity :- " + rs.getInt(5));
					pQuantity = rs.getInt(5);

					System.out.println("\n");
				}
			} catch (Exception e) {
				System.out.println(e);
			} finally {
				try {
					conn.close();
					ps.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}
			// =====Below Code used to insert Product data into Cart table
			// ===================================================================

			try {
				Connection conn11 = DatabaseConnection.getConnection();
				PreparedStatement ps11 = null;

				String s3 = "insert into " + User.uName
						+ "(UProductId,UProductName,UProductDiscription,UProductPrice,UProductQuantity,UProductTotalPrice)values(?,?,?,?,?,?);";

				ps11 = conn11.prepareStatement(s3);
				int price = ((value) * (Integer.valueOf(pPrice))); // price=((value) * (Integer. valueOf(pPrice))); :
																	// "+((value) * (Integer.
																	// valueOf(pPrice))));//conversion of String to int
																	// for multiplication
				ps11.setInt(1, key);
				;
				ps11.setString(2, pName);
				ps11.setString(3, pDescription);
				ps11.setString(4, pPrice);
				ps11.setInt(5, value);
				ps11.setString(6, Integer.toString(price)); // conversion of int to String manually
				int j = ps11.executeUpdate();

				System.out.println("Successful");

				conn11.close();
				ps11.close();

			} catch (SQLException e) {
				System.out.println(e);
			}

		}
//=====================================================================================

		this.UserCartDataShow();
	}
//================================================================================================//
// This ShowProduct Method will Show the Product Available into Product Table.                    // 	
//================================================================================================//	

	@Override
	public void showProduct() {
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			while (rs.next())// Name,Description,Price,Quantity
			{
				// In case of Show Product Class if Quantity less than Zero
				// It will print our of Stock massage
				int a = rs.getInt(5);
				if (a > 0) {

					System.out.println("======================================");
					System.out.println("ProductId :-          " + rs.getInt(1));
					System.out.println("Name :-               " + rs.getString(2));
					System.out.println("Description :-        " + rs.getString(3));
					System.out.println("Price :-              " + rs.getString(4));
					System.out.println("Remaining Quantity :- " + a);
					System.out.println("\n");

				}

				else {
					System.out.println("======================================");
					System.out.println("ProductId :-          " + rs.getInt(1));
					System.out.println("Name :-               " + rs.getString(2));
					System.out.println("Description :-        " + rs.getString(3));
					System.out.println("Price :-              " + rs.getString(4));
					System.out.println("Out of Stock          " + a);
					System.out.println("\n");
				}

			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
				ps.close();

			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

//==============================================================================================================//
// EachUserCreateTable Method will Create the Cart table Dynamically for Every user with Username as Table name   //
//==============================================================================================================//

	@Override
	public void EachUserCreateTable() {
		Connection conn = DatabaseConnection.getConnection();
		PreparedStatement ps = null;
		try {
			System.out.println("User creating Cart table with user name :=  " + User.uName);
			String sql = "create table " + User.uName
					+ "(Id int primary key auto_increment not null,UProductId int, UProductName varchar(100),UProductDiscription varchar(100), UProductPrice varchar(20), UProductQuantity int,UProductTotalPrice varchar(20))";
			ps = conn.prepareStatement(sql);
			int j = ps.executeUpdate();

			System.out.println("Cart Table Created Successfully..!!!");
			conn.close();
			ps.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
//======================================================================================================//	
// USer Cart Data Show Methdod will show the Data for User from Cart Table  after Product Selection    //
//======================================================================================================//

	@Override
	public void UserCartDataShow() {
		int key1;
		try {

			System.out.println("========================User Cart Table ====================\n");

			Iterator<Integer> itr = al.iterator(); // Iterate ArrayList in which Product Id is stored

			for (int i = 0; i < al.size(); i++) {

				key1 = 0;
				key1 = al.get(i); // Store the Product Id into key and Pass this input to Query

				Connection conn2 = DatabaseConnection.getConnection();
				PreparedStatement ps2 = null;

				String tableName = User.uName; // Here we Store the User Cart table name into variable and Pass this
												// dynamically.

				String s5 = "select UProductId,UProductName,UProductPrice,UProductQuantity,UProductTotalPrice from "
						+ tableName;
				String s6 = " where UProductId= ";

				ps2 = conn2.prepareStatement(s5 + s6 + key1);

				ResultSet rs = ps2.executeQuery();
				while (rs.next()) {
					System.out.println("========================================");
					System.out.println("ProductId = 	         " + rs.getInt(1));
					System.out.println("ProductName =		 " + rs.getString(2));
					System.out.println("ProducDiscription =	 " + rs.getString(3));
					System.out.println("ProductQuantity =  	 " + rs.getInt(4));
					System.out.println("ProductTotalPrice =      " + rs.getString(5));
					System.out.println("\n");
				}

				conn2.close();
				ps2.close();
			}
		} catch (SQLException e) {
			System.out.println(e);
		}

		// ===========================user total payble value for
		// shopping===============================

		try {
			String rupees = null;
			Connection conn3 = DatabaseConnection.getConnection();
			PreparedStatement ps3 = null;
			ps3 = conn3.prepareStatement("Select sum(UProductTotalPrice) from " + User.uName);
			ResultSet rs = ps3.executeQuery();
			while (rs.next()) {
				rupees = rs.getString(1);
			}

			System.out.println("===================================");
			System.out.println(" Total payable value is : " + rupees);
			System.out.println("===================================");
			conn3.close();
			ps3.close();
		} catch (Exception e) {
			System.out.println(e);
		}

		// ================ Redirect to User Home
		// Page=======================================================

		UserView userview = new UserView();
		userview.userHomePage();
	}
}

//===========================================================END===========================================================