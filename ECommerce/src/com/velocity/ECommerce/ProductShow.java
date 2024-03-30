package com.velocity.ECommerce;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
public class ProductShow   
{	
	static int id,quant,pQuantity;
	static String pName,pDescription,pPrice;
	//static String pName,pDescription,pPrice;
 
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();//hashmap is created for same product id and duplicate quantity entered multiple times
	Scanner sc=new Scanner(System.in);
	
	
	public void productDetails()
	{
		System.out.println("If you Want to Disply Products Ascending Order by it's Price  Then Press Y Else N");
		char choise = sc.next().charAt(0);
		
	    Connection con=null;
		if(choise=='Y' || choise=='y')
		{
			System.out.println( "\t\t\t\t\t\t\t-: Buy The Products :-");
			DatabaseConnection DC= new DatabaseConnection();
		      con=DC.getConnection();
		      PreparedStatement ps=null;
		      
		      try {
				    ps=con.prepareStatement("select * from product  order by Price desc");
				    
				    ResultSet rs=ps.executeQuery();
				    while(rs.next())
				    {
				    	System.out.println("ProductId :-   "+rs.getInt(1));
				    	System.out.println("Name :-        "+rs.getString(2));
				    	//ProductShow.pName=rs.getString(2);
				    	System.out.println("Description :- "+rs.getString(3));
				    	//ProductShow. pDescription=rs.getString(3);
				    	System.out.println("Price :-   	   "+rs.getString(4));
				    	//ProductShow.pPrice=rs.getString(4);
				    	System.out.println("Quantity :-    "+rs.getInt(5));
				    	System.out.println("\n"); 					    	
				    }				    
				    System.out.println("Successful");				    
			      } 
			catch (SQLException e) {
				System.out.println(e);
			} finally {
				try {
					con.close();
					ps.close();
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		else
		{
			System.out.println( "\t\t\t\t\t\t\t-: Buy The Products :-");
			this.showProduct();//default product list will be displyed as it is in table stored
		}		 
		this.selectProduct();		
	}
	
	
	public void selectProduct()
	{
		int tableQuantity,result;
		System.out.println( "\t\t\t\t\t\t\t-: Buy The Products :-");
		System.out.println("\t\t\t\t\t\t\t-:Select Product:-");
		System.out.println("Enter How Many Product you Want to buy :- ");
		int n=sc.nextInt();//3
		try 
		{
			Connection conn=DatabaseConnection.getConnection();
			PreparedStatement ps=null;			 
			//hm.put(0, 0);
			int count=0;
			for (int i=0;i<n;i++)//3
			{ 		count++;	
				tableQuantity=0;
				result=0;
				if ( i>=1)
				{ 
					this.showProduct();	//fresh data will be displyes after performing quantiy minus operation
				}
				
				System.out.println("Enter ProductId You Want to select :- ");
				id=sc.nextInt();//2,2
				System.out.println("Enter Product Quantity You Want to buy :- ");
				quant=sc.nextInt();//1,1
				   
				hm.put(id, quant);//2,1,2,1    //hashmap for unique key and if key is same its value should be replaced and key reamin as it is
				
				
				ps=conn.prepareStatement(" select Quantity from product where ProductId=?");
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					tableQuantity=rs.getInt(1);
				} 			
				result=tableQuantity-quant; 
				
				ps = conn.prepareStatement("update product set Quantity=? where ProductId=?");
				ps.setInt(1, result);				 
				ps.setInt(2, id);
				int l=ps.executeUpdate();
				
				
				if(count==1)
				{
				 this.EachUserCreateTable();//every user only ones create the user cart table in database
				} 			
			}		
		}
		catch(Exception e)
		{
		 	System.out.println(e.getMessage());
			System.out.println(e);
		}	
		this.addUserData();
		this.UserCartDataShow();
	} 
	
	
	public  void showProduct()
	{
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps=null;	
		try 
		{
			ps = conn.prepareStatement("select * from product");			
			ResultSet rs=ps.executeQuery();
			while(rs.next())// Name,Description,Price,Quantity 
			{			
				System.out.println("ProductId :-          "+rs.getInt(1));
				System.out.println("Name :-               "+rs.getString(2));
				//pName=rs.getString(2);
		    	System.out.println("Description :-        "+rs.getString(3));
		    	//pDescription=rs.getString(3);
		    	System.out.println("Price :-              "+rs.getString(4));
		    	//pPrice=rs.getString(4);
		    	System.out.println("Remaining Quantity :- "+rs.getInt(5));
		    	//pQuantity=rs.getInt(5);
		    	System.out.println("\n");    		
			}
		}
		catch (Exception e)
		{ 
			System.out.println(e);
		}
		finally
		{
			try {
				conn.close();
				ps.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
	}
	
	public void EachUserCreateTable()
	{
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps=null;		
		try										 
		{
			System.out.println("user creating table user name : "+User.uName);
			String sql="create table "+User.uName+"(Id int primary key auto_increment not null,UProductId int, UProductName varchar(100),UProductDiscription varchar(100), UProductPrice varchar(20), UProductQuantity int,UProductTotalPrice varchar(20))";      
			ps=conn.prepareStatement(sql);
			int j=ps.executeUpdate();
			//System.out.println(j);//0
			conn.close();
			ps.close();				
		}
		catch (Exception e)
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
				
	}
	
	public void addUserData()
	{
	System.out.println("userdata ....");
	//data insertion
	//Iterating Hashmap... 
	int key=0;
	int value=0;
 
	String Name=null,Discription=null,Price=null;
	for(Map.Entry<Integer, Integer> m : hm.entrySet())
	{    //11/22/33/
		key=m.getKey();//id are stored
		value=m.getValue();//quantity are stored 
		System.out.println("key"+key);
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps=null;
		try 
		{
			//get the data of product for perticuler user choid productid
			String sql="select Name,Description,Price from product where ProductId"+key+";";
			ps=conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Name=rs.getString(2);
				Discription=rs.getString(3);
				Price=rs.getString(4);
			}
			System.out.println("name ..."+Name);
			System.out.println("description ..."+Discription);
			System.out.println("price ..."+Price);
		} catch (Exception e)
		{
			e.printStackTrace();
			 //System.out.println(e);
		}
	
	
	 //Data adding into user cart table
		try
		{
			Connection conn11=DatabaseConnection.getConnection();
			PreparedStatement ps11=null;		 
				
		ps11=conn11.prepareStatement("insert into "+User.uName+"(UProductId,UProductName,UProductDiscription,UProductPrice,UProductQuantity,UProductTotalPrice)values(?,?,?,?,?,?)");
		
		int sum=((value) * (Integer. valueOf(Price)));  
		
		ps11.setInt(1, key);  
		ps11.setString(2, Name); 
		ps11.setString(3, Discription);	 
		ps11.setString(4, Price);	 
		ps11.setInt(5,  value); 
		ps11.setString(6, Integer.toString(sum));//converting primitive to non primitive  
		
		
		int j=ps11.executeUpdate();
		System.out.println(j);
		conn11.close();
		ps11.close();
			 
		} 
		catch (SQLException e)
		{ 
			e.printStackTrace();
			System.out.println(e);
		}
	}
	}	
	 public void UserCartDataShow()
	 {
	// user cart dataShowing
	 try
	{
		for(Map.Entry<Integer, Integer> m1 : hm.entrySet())
		{    
			int key1=m1.getKey();
		Connection conn2=DatabaseConnection.getConnection();
		PreparedStatement ps2=null;	
		ps2=conn2.prepareStatement("Select UProductId,UProductName,UProductDiscription,UProductPrice,UProductQuantity,UProductTotalPrice from "+User.uName+"where id="+key1);
		ResultSet rs=ps2.executeQuery();
		while(rs.next())
		{
			System.out.println("ProductId : 	     "+rs.getInt(1));
			System.out.println("ProductName :		 "+rs.getString(2));
			System.out.println("ProducDiscription :	 "+rs.getString(3));			
			System.out.println("ProductQuantity : 	 "+rs.getInt(4));
			System.out.println("ProductTotalPrice :  "+rs.getString(5));
			System.out.println();
		}
		
		conn2.close();
		ps2.close();
		}
	} 
	catch (SQLException e) 
	{
		 System.out.println(e);
	}
	//user total payble value for shopping
	try
	{
		String rupees=null;
		Connection conn3=DatabaseConnection.getConnection();
		PreparedStatement ps3=null;	
		ps3=conn3.prepareStatement("Select sum(UProductTotalPrice) from "+User.uName);
		ResultSet rs=ps3.executeQuery();
		while(rs.next())
		{
			rupees=rs.getString(1);
		}
		
		System.out.println("Total payable value is : "+rupees);
		conn3.close();
		ps3.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
		hm.clear();
		
		
		System.out.println("1.User Home Page \t 2.Exit");
		
		System.out.println("Enter your Choice : ");
		int a=sc.nextInt();	 
		
		switch(a)
		{
			case 1:
			{
				UserView.userHomePage();
				break;
			}
			case 2:
			{
				System.exit(0);
				break;
			}
			default : 
			{
				System.out.println("Invalid Choice");
			}
			
		} 
	}
	
	
	public static void CheckProducts()
	{
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps=null;	
		try 
		{
			ps = conn.prepareStatement("select * from product");			
			ResultSet rs=ps.executeQuery();
			while(rs.next())// Name,Description,Price,Quantity 
			{			
				System.out.println("ProductId :-          "+rs.getInt(1));
				System.out.println("Name :-               "+rs.getString(2));
				pName=rs.getString(2);
		    	System.out.println("Description :-        "+rs.getString(3));
		    	pDescription=rs.getString(3);
		    	System.out.println("Price :-              "+rs.getString(4));
		    	pPrice=rs.getString(4);
		    	System.out.println("Remaining Quantity :- "+rs.getInt(5));
		    	pQuantity=rs.getInt(5);
		    	System.out.println("\n");    		
			}
		}
		catch (Exception e)
		{ 
			System.out.println(e);
		}
		finally
		{
			try {
				conn.close();
				ps.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Buy the Product");
		System.out.println("1.Registere User \t 2. Login User \t 3.User Home Page" );
		
		System.out.println("Enter your Choice : ");
		int a=sc.nextInt();
		User user=new User();
		switch(a)
		{
			case 1:
			{
				user.userRegistration();
				break;
			}
			case 2:
			{
				user.userLogin();
				break;
			}
			case 3:
			{
				UserView.userHomePage();
				break;
			}
			default : 
			{
				System.out.println("Invalid Choice");
			}
			
		} 
		
	}
	
}
 