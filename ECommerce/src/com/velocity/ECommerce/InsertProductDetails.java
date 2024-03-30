package com.velocity.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertProductDetails
{
	public void insertProduct()
	{//  # product id,name, description, price,  quantity.
		Scanner sc=new Scanner(System.in);
//		System.out.println("How many Products Your want to Add : ");
//		int num=sc.nextInt();
//		for(int j=0;j<num;j++)
//		{	
			System.out.println("Enter Product Name : ");
			String pName=sc.nextLine();
			
			System.out.println("Enter Product Description : ");
			String pDescription=sc.nextLine();
			
			System.out.println("Enter Product Price : ");
			String pPrice=sc.nextLine();
			
			System.out.println("Enter Product Quantity : ");
			int pQuantity=sc.nextInt();
		
			Connection conn=DatabaseConnection.getConnection();		
			PreparedStatement ps1;
			try 
			{
				ps1 = conn.prepareStatement("insert into product(Name,Description,Price,Quantity)values(?,?,?,?)");		 
				ps1.setString(1, pName);
				ps1.setString(2, pDescription);
				ps1.setString(3, pPrice);
				ps1.setInt(4, pQuantity);
		 	
				int i=ps1.executeUpdate();
				System.out.println(i);
				conn.close();
				ps1.close();
			}
			catch (Exception e)
			{
				System.out.println(e); 
			}
		//} 
		/*System.out.println("want to add anothe product Y/N");
		String ch=sc.next();
		if(ch=="Y")
		{
			InsertProductDetails insertProductDetails=new InsertProductDetails();
			insertProductDetails.insertProduct();			
		}
		else
		{
			AdminView adminView=new AdminView();
			adminView.AdminHomeTab();
		}*/
		 
		AdminView adminView=new AdminView();
		adminView.AdminHomeTab();
	}
}
