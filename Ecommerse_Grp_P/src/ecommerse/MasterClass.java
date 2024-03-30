// Start the Execution of Program 
// Write a UI of Project where user can give the input and it will get Stored into Table;

package ecommerse;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MasterClass {
	
	public static void main(String[] args) throws SQLException {

		//Scanner sc= new Scanner(System.in);
		
		/*
		System.out.println("Enter the Description of Product");
		String Description= sc.next();
		
		System.out.println("Enter the Name of Product");
		String Name= sc.next();
		
		System.out.println("Enter the Price of Product");
		String Price= sc.next();
		
		System.out.println("Enter the Quantity of Product");
		String Quantity= sc.next();
	    
		ProductData pd= new ProductData();
		pd.getProductInfo(Description, Name, Price, Quantity);
	*/
	
	/*	
	           ============== Product List in Acending Order============================ 
		ListAcending listacending= new ListAcending();
		System.out.println("Selected Option to arange Product List in Price Acending Order \n");
		listacending.listAcending();
		
	*/
		
		//===================Product  Retrival from ID======================================
		
	/*	System.out.println("Enter the Id of product for Which Quantity you want to retrive");
		int Id=sc.nextInt();
		
		QuantityProduct quantityproduct= new QuantityProduct();
		quantityproduct.getQuantity(Id);
		
	*/
		
	
		
	/*	
	   ==========================Print all the registrer user List==============================
	 
	    System.out.println("Print the all Registstor User List\n");
		UserList userlist=new UserList();
		
		userlist.getUserList();
	 
	 */
	/*	
// ===========================================================================================================================
		// Create Table Cart and Check user is Registred or Not if registed then can see the Product and add to cart for Buy
		// If nit registred the Got to User Registraion Page and Reigstred 
		
		System.out.println("If your are Registared User Then Press Y Else N  ");
		char choise = sc.next().charAt(0);
		if(choise=='Y')
		{
			DisplayProducts DP=new DisplayProducts();
			DP.getListProduct();
			
			System.out.println("Product List want to in Acending Order Press Y for Show Or Press B for Buy");
			char choise2 = sc.next().charAt(0);
			
			    if(choise2=='Y')
		     	{
			     	ListAcending listacending= new ListAcending();
				    System.out.println("Selected Option to arange Product List in Price Acending Order \n");
				    listacending.listAcending();
			    }
		    	else if(choise2=='B')
			
			   {
				
			
		           System.out.println("Please select How many Product you want to Buy");
		           int no=sc.nextInt();
		           ArrayList<Integer> al=new ArrayList<Integer>();
		 		   
	               for(int i=1;i<=no;i++)
	        	
	                  {
	        	          System.out.println("Enter the product Id");
	        	          int id=sc.nextInt();
	        	          al.add(id);
	                  }
			
		           System.out.println(al);
		           System.out.println(al.get(0));
		           System.out.println(al.get(1));
			
			       CreateTable  createtable = new CreateTable();
			       createtable.getUserList(al);			
			   }else
			   {
				   System.out.println("Please Enter Valid Choise");
			   }
				   
		}else if(choise=='N')
		{
			System.out.println("Registred Yourself into our P Mall to See and buy the Products \n");
			System.out.println(" Please enter Below Information to Registration");
			
			System.out.println("Enter the User First name ");
			String FirstName= sc.next();
			
			System.out.println("Enter the User Surname name ");
			String Surname= sc.next();
			
			System.out.println("Enter the User City name ");
			String City= sc.next();
			
			System.out.println("Enter the User Mobile name ");
			String Mobile= sc.next();
			
			System.out.println("Enter the User Username name ");
			String Username= sc.next();
			
			System.out.println("Enter the User Password name ");
			String Password= sc.next();
			
			UserData ud=new UserData();
			ud.getUserData(FirstName, Surname, City, Mobile, Username, Password);
					
		} else
		{
			System.out.println("Enter Valid Choise and Try again");
		}
		
//====================================================================================================================		
		

		
/*	
     
    	=======User can Calculate the sum of price of all cart Item==================
		
		
		System.out.println("You Can check the the Sum of Price of your Cart");
		CartPriceSum cartpricesum=new CartPriceSum();
		cartpricesum.getCartSum();
*/
		
		
		
 }

}
