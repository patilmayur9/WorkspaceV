//===================================================PRODUCT SHOW CLASS=============================================================//
// Class Designed By:- Mayur Patil
// We have Implemented method into this Class which is Declared as Abstract in requirement Interface.
// 1.productDetails()         :- Dispaly the Product in Acending List
// 2.selectProduct()          :- Select the Product and Quantity for Buy ( Can Select the Multiple Product)
// 3.showProduct()            :- This method will show all the Products to user which is Available into Shopping Mall
// 4.EachUserCreateTable()    :- Create the Seprate cart table for each user ( Table name and User Name Should Be same) 
// 5.UserCartDataShow()       :- This Method will Show the Cart Table data to user.
// 6.addUserData()            :- This Method will add the user Data
// 7.CheckProducts()          :-  User can Check all the Data From Product Table.

//
//=====================================================================================================================================//

package com.velocity.Ecommerse;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ProductShow implements requirement  {	
	static int id,quant,pQuantity;
	static String pName,pDescription,pPrice;
	
	                                      
	//static String pName,pDescription,pPrice;
 
	HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
	HashMap<Integer, Integer> hm1=new HashMap<Integer, Integer>();//hashmap is created for same product id and duplicate quantity entered multiple times
	Scanner sc=new Scanner(System.in);
	
//============================================================================================================
// This Product Details Method will show the Product in Acending Order
//============================================================================================================	

@Override

public void productDetails()
	{   
	    System.out.println("\n================Welcome to Product Details Page===============\n");
		System.out.println("If you Want to Disply Products Ascending Order by it's Price  Then Press Y Else N");
		char choise = sc.next().charAt(0);
		
	    Connection con=null;
		if(choise=='Y' || choise=='y')
		{
			System.out.println( "========================Buy The Products ========================");
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
				    	ProductShow.pName=rs.getString(2);
				    	
				    	System.out.println("Description :- "+rs.getString(3));
				    	ProductShow. pDescription=rs.getString(3);
				    	
				    	System.out.println("Price :-   	   "+rs.getString(4));
				    	ProductShow.pPrice=rs.getString(4);
				    	
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
			System.out.println( "\"========================Buy The Products ========================\"");
			this.showProduct();//default product list will be displyed as it is in table stored
		}		 
		this.selectProduct();		
	}
//===========================================================================================================================//
// This selectProduct method will Select the Product from Product Show 
// Can Slect The Multiple Product and Respective Qty for Each Product	
// Selected Qty will give input for AddUserData method which will add Data into Cart	
//==========================================================================================================================//	

@Override
public void selectProduct()
	{
		int tableQuantity,result;
		 
		System.out.println("========== User can Buy Multiple Products=====");
		System.out.println("==============Select Product==================");
		
		System.out.println("\nEnter How Many Product you Want to buy:-  ");
		int n=sc.nextInt();//3
		try 
		{
			Connection conn=DatabaseConnection.getConnection();
			PreparedStatement ps=null;			 
			//hm.put(0, 0);
			int count=0;
			for (int i=0;i<n;i++)//3
			{ 		
				count++;	
				tableQuantity=0;
				result=0;
				 
				
				System.out.println("Enter ProductId You Want to select :- ");
				id=sc.nextInt();//2,2
				System.out.println("Enter Product Quantity You Want to buy :- ");
				quant=sc.nextInt();//1,1
				  //1
					
				//quant+=quant;
				System.out.println(id);
				System.out.println(quant);
				
				hm.put(id, quant);//2,1,2,1 //hashmap for unique key and if key is same its value should be replaced and key reamin as it is
				System.out.println(hm);  
				
				System.out.println(id);
				System.out.println(quant);
				
				String s1="select Quantity from product where ProductId=?;";
				
				ps=conn.prepareStatement(s1);
				ps.setInt(1, id);
				ResultSet rs=ps.executeQuery();
				
				while(rs.next())
				{
					tableQuantity=rs.getInt(1);
				} 			
				result=tableQuantity-quant; 
				
				String s2="update product set Quantity=? where ProductId=?;";
				
				ps = conn.prepareStatement(s2);
				ps.setInt(1, result);				 
				ps.setInt(2, id);
				int l=ps.executeUpdate();
				
				if (n>1)
				{ 
					this.showProduct();	//fresh data will be displyes after performing quantiy minus operation
				}
				if(count==1)
				{
				 ProductShow productshow=new ProductShow();	
				 productshow.EachUserCreateTable();
				}
							
			}	
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
	    	System.out.println(e);
		}
		//===============
		
//============================================================================================
		int key=0;
		int value=0;
		
		  Iterator<Entry<Integer, Integer>> it = hm1.entrySet().iterator();
		 
		    while (it.hasNext()) 
		    {
		    	System.out.println("Start");

		        Map.Entry<Integer,Integer> pair = (Map.Entry)it.next();
		        System.out.println("pair.getKey() = "+pair.getKey());
		        System.out.println("pair.getValue() = "+pair.getValue());
		        
		    
		   
		          System.out.println("last value of key id is   "+key);
		          System.out.println("last value of value of Quantity is   "+value);
			
		 try
			{
				Connection conn11=DatabaseConnection.getConnection();
				PreparedStatement ps11=null;	
				//System.out.println("user inserting hamap data into  table that time user name is : "+User.uName);
					
			String s3="insert into "+User.uName+"(UProductId,UProductName,UProductDiscription,UProductPrice,UProductQuantity,UProductTotalPrice)values(?,?,?,?,?,?);";
			
			ps11=conn11.prepareStatement(s3);
			int price=((value) * (Integer. valueOf(pPrice)));  //System.out.println("int price=((value) * (Integer. valueOf(pPrice)));  : "+((value) * (Integer. valueOf(pPrice))));//conversion of String to int for multiplication
			ps11.setInt(1, key); // System.out.println("1,key"+key);
			ps11.setString(2, pName); // System.out.println("2,pName"+pName);
			ps11.setString(3, pDescription);	//System.out.println("3,pDescription"+pDescription);
			ps11.setString(4, pPrice);	//System.out.println("4,pPrice"+pPrice);
			ps11.setInt(5,  value); //System.out.println("5,value"+value);
			ps11.setString(6, Integer.toString(price)); //System.out.println("6,Price"+Integer.toString(price));//conversion of int to String manually
			int j=ps11.executeUpdate();
			
			System.out.println("Successful");
			
			//conn11.close();
			//ps11.close();
				 
			} 
			catch (SQLException e)
			{ 
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
				   
			    }catch (Exception e) 
			    {
				  System.out.println(e);
			    }			
		}
 }

//==============================================================================================================//
// Each Create Table Method will Create the Cart table Dynamically for Every user with Username as Table name   //
//==============================================================================================================//

@Override
public void EachUserCreateTable()
	{
		Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps=null;		
		try										 
		{
			System.out.println("User creating Cart table with user name :=  "+User.uName);
			String sql="create table "+User.uName+"(Id int primary key auto_increment not null,UProductId int, UProductName varchar(100),UProductDiscription varchar(100), UProductPrice varchar(20), UProductQuantity int,UProductTotalPrice varchar(20))";      
			ps=conn.prepareStatement(sql);
			int j=ps.executeUpdate();
			
			System.out.println("Cart Table Created Successfully..!!!");
			conn.close();
			ps.close();	
			
		}
		catch (Exception e)
		{
		   System.out.println(e);
		}
				
	}
	
//==========================================================================================================//	
// Add User data Method will Add the Selected Product into that cart Table which is Dynamically created     //
//==========================================================================================================//	
/*

@Override
public void  addUserData()
    {

	     System.out.println("Userdata ....");
         //data insertion
         //Iterating Hashmap... 
                int key=0;
                int value=0;

 String Name=null,Discription=null,Price=null;

 System.out.println("Outside of For Loop");
 
 System.out.println(hm);
 
  Set<Integer> s=hm.keySet();
  Iterator<Integer> itr= s.iterator();
  while(itr.hasNext())
  {
	  System.out.println("In Loop");
	  int i=itr.next();
	  System.out.println("Key="+i);
	  System.out.println("value="+hm.get(i));
  }
  System.out.println("After Loop");
 
// for(Map.Entry<Integer, Integer> m : hm.entrySet())
	 
  //{     System.out.println("inside of For Loop");
	//key=m.getKey();//id are stored
	//value=m.getValue();//quantity are stored 
  
	//System.out.println("key="+key);
	//System.out.println("Value="+value);
 //}	
	/*Connection conn=DatabaseConnection.getConnection();
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
  */
//  System.out.println("End");

  //}

//================================================================================

@Override
public void addUserData()
	{
	
	int key=0;
	int value=1;
	
	  Iterator<Entry<Integer, Integer>> it = hm1.entrySet().iterator();
	 
	    while (it.hasNext()) {
	    	System.out.println("Start");
	    	
	        Map.Entry<Integer,Integer> pair = (Map.Entry)it.next();
	        System.out.println("pair.getKey() = "+pair.getKey());
	        System.out.println("pair.getValue() = "+pair.getValue());
	        
	        
	    
	        
	
	// for (Integer k : hm.keySet()) 
	//  {
		//System.out.println("in");
	    //System.out.println("Key = " + k);
	    //key=k;

	
	
	
	
//	for(Map.Entry<Integer, Integer> m : hm.entrySet())
	//{    
		//key=m.getKey();//id are stored
		//value=m.getValue();//quantity are stored 
		
	   //System.out.println("HashMap all data   "+hm);//HashMap{1=1, 3=1}	
	
	System.out.println("last value of key id is   "+key);
	System.out.println("last value of value of Quantity is   "+value);
		
	 try
		{
			Connection conn11=DatabaseConnection.getConnection();
			PreparedStatement ps11=null;	
			//System.out.println("user inserting hamap data into  table that time user name is : "+User.uName);
				
		String s3="insert into "+User.uName+"(UProductId,UProductName,UProductDiscription,UProductPrice,UProductQuantity,UProductTotalPrice)values(?,?,?,?,?,?);";
		
		ps11=conn11.prepareStatement(s3);
		int price=((value) * (Integer. valueOf(pPrice)));  //System.out.println("int price=((value) * (Integer. valueOf(pPrice)));  : "+((value) * (Integer. valueOf(pPrice))));//conversion of String to int for multiplication
		ps11.setInt(1, key); // System.out.println("1,key"+key);
		ps11.setString(2, pName); // System.out.println("2,pName"+pName);
		ps11.setString(3, pDescription);	//System.out.println("3,pDescription"+pDescription);
		ps11.setString(4, pPrice);	//System.out.println("4,pPrice"+pPrice);
		ps11.setInt(5,  value); //System.out.println("5,value"+value);
		ps11.setString(6, Integer.toString(price)); //System.out.println("6,Price"+Integer.toString(price));//conversion of int to String manually
		int j=ps11.executeUpdate();
		
		System.out.println("Successful");
		
		//conn11.close();
		//ps11.close();
			 
		} 
		catch (SQLException e)
		{ 
			System.out.println(e);
		}
	}
}
//======================================================================================================//	
// USer Cart Data Show Methdod will show the Data for User from Cart Table                              //
//======================================================================================================//

@Override
public void UserCartDataShow()
	 {
	
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
	   
	//===========================user total payble value for shopping===============================
	
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
		//hm.clear();
		
     //================ Redirect to User Home Page=======================================================
		
		   UserView userview= new UserView();
		   userview.userHomePage();		
}
	
//==========================================================================================================// 
// CheckProduct Method is Show the all Products Available into Shopping Mall
//=========================================================================================================//

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
			try 
			{
			    conn.close();
				ps.close();
				
			} catch (Exception e) 
			{
				System.out.println(e);
			}			
		}
		
	     //==============  Redirect the UserHome Page===========
		
		   UserView userview= new UserView();
		   userview.userHomePage();
			
	} 
		
}
//===========================================================END===========================================================