 //=========================  Project Ecommerse  Gropu-P=============================================== 

//=========================  Technology:- 1.JDBC 2. MySQL  3. CoreJAVA================================
//=========================  Particiepent :- Mohd Ezaz, Mayur Patil, Pratik Sonawane, Ravindra Palaskar==================
package ecommerse;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass implements EcommerseProject{
	
	static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) throws SQLException {
		
		System.out.println(" ===========Welcome To our Shoppling Mall ============");
		
		
		System.out.println("Enter Your Choise");
		int choise= sc.nextInt();
		MainClass main = new MainClass();
		
		switch(choise)
		{
		    case 1: System.out.println("Store Products into Mall");
		            main.addProduct();
		            break;
		            
		    case 2: System.out.println("See the Product from our Mall");
		            main.showProduct();
		            break;
		            
		    case 3: System.out.println("Check Quantity of Each product Available Mall");
		            main.checkQty();
		            break;
		            
		    case 4: System.out.println("See the all registred User List from our mall");
                    main.showUser();
                    break;
                    
		    case 5: System.out.println("See the User History From Product Purchase");
                    main.userHistory();
                    break;

			default:System.out.println("Thanks for visiting our mall...!! Please visit again..!!"); 
			        System.out.println("Enjoy your day Sir");
			        break;
		}
	}

	@Override
	public void addProduct(){
		
		System.out.println("Enter the Product details to Update the Stock into mall");
		System.out.println("How Many Product you want to add");
		int number= sc.nextInt();
		
		for(int i=1;i<=number;i++) 
		  {
		
			System.out.println("Enter the Description of Product");
			String Description= sc.next();
		
			System.out.println("Enter the Name of Product");
			String Name= sc.next();
		
			System.out.println("Enter the Price of Product");
			String Price= sc.next();
		
			System.out.println("Enter the Quantity of Product");
			String Quantity= sc.next();
	    
			ProductData pd= new ProductData();
			try {
				    pd.getProductInfo(Description, Name, Price, Quantity);
			    } catch (SQLException e) {
				    System.out.println(e);
			    }
			
	       }
	}

	@Override
	public void showProduct() {
		
		System.out.println("If your are Registared User Then Press Y Else N");
		char choise = sc.next().charAt(0);
		
		if(choise=='Y')
		{
			DisplayProducts DP=new DisplayProducts();
			try {
				  DP.getListProduct();
			    } catch (SQLException e1) 
			    {
				  System.out.println(e1);
			    }
			
			System.out.println("Product list into Acending order of Price (Press Y for show) Or (Press B for Buy)");
			char choise2 = sc.next().charAt(0);
			
			    if(choise2=='Y')
		     	{
			     	ListAcending listacending= new ListAcending();
				    System.out.println("Selected Option to arange Product List in Price Acending Order \n");
				    try {
						  listacending.listAcending();
					    } catch (SQLException e) 
				        {
						  System.out.println(e);
					    }
				   
				    
			    }
		    	else if(choise2=='B')
			
			     {
		           System.out.println("Please select How many Product you want to Buy");
		           int no=sc.nextInt();
		           ArrayList<Integer> al=new ArrayList<Integer>();
		 		   
	               for(int i=1;i<=no;i++)
	        	
	                  {
	        	          System.out.println("Enter the product Id "+i);
	        	          int id=sc.nextInt();
	        	          al.add(id);
	                  }
			
		           System.out.println(al);
		           //System.out.println(al.get(0));
		           //System.out.println(al.get(1));
			
			       CreateTable  createtable = new CreateTable();
			       try {
					     createtable.getUserList(al);
				       } catch (SQLException e) 
			           {
					     System.out.println(e);
				       }			
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
			try {
				   ud.getUserData(FirstName, Surname, City, Mobile, Username, Password);
			    }  catch (SQLException e)
                {
				   System.out.println(e);
			    }
					
		} else
		{
			System.out.println("Enter Valid Choise and Try again");
		}
		
	}

	@Override
	public void checkQty() {
		
		System.out.println("Enter the Id of product for Which Quantity you want to Check");
		int Id=sc.nextInt();
		
		
		QuantityProduct quantityproduct= new QuantityProduct();
		try {
			  quantityproduct.getQuantity(Id);
		    }  
		catch (SQLException e) 
		    {
			   System.out.println(e);
		    }
		
	}

	@Override
	public void showUser()  {
		
		System.out.println("Print the all Registstor User List\n");
		UserList userlist=new UserList();
		try {
			  userlist.getUserList();
		    } catch (SQLException e) 
		    {
			  System.out.println(e);
		    }
		
	}

	@Override
	public void userHistory() {
		
		System.out.println("Work in Process Thank you");
		
	}

	
}

	

