package com.Pratik.interview.Questions;
import java.util.*;
import java.text.*;
public class Prop {

 



//Question:
//The program below requires completion and then compile and run.
//The program is a list of properties with their MLS ID, Address, and Price.
//
//
//—-------------------------------------------------------------------------------------------------

// Java program to demonstrate initializing
// an array of objects using constructor
 

    	// Declaring an array of properties
	public Property[] arr;

	public static void main(String args[]) throws ParseException
	{
        	  Prop propObj = new Prop();

	  // Allocating memory for 7 objects of type Property
  propObj.arr = new Property[7];
 
	  // Initializing the list of the array NOT SORTED in price.
	  propObj.arr[0] = new Property(17270, "123 Main Street, Boston", "$258,000");
	  propObj.arr[1] = new Property(17219, "71 Beacon Hill, Boston", "$358,000");
              propObj.arr[2] = new Property(17221, "722 Newbury Street, Boston", "$1,380,000");
              propObj.arr[3] = new Property(17222, "101 Beacon Hill, Boston", "$808,000");
              propObj.arr[4] = new Property(17223, "511 South End, Charleston", "$498,000");
              propObj.arr[5] = new Property(17224, "90 India Street, Boston", "$1,390,000");
              propObj.arr[6] = new Property(17225, "71 Bright Ave, Cambridge", "$709,000");

             //Display Property Data
             for (int i = 0; i < propObj.arr.length; i++)
             { 
    		propObj.arr[i].display();
             }

           //Display Average Price   
           int avg = propObj.getAverage(propObj.arr);
           NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);
           String currency = format.format(avg);
           System.out.println("Average Price: " + currency);

           	//Display Highest Price
           propObj.displayMaxPrice(propObj.arr);	

        	//Display List in Price Sorted Order
        	propObj.displaySorted(propObj.arr);
    }

    

	//return average price of all the houses in the array
     //HINT:
     //Use the following code to convert the price String to int value
     //int val = NumberFormat.getCurrencyInstance().parse(theArray[i].getPrice()).intValue();
    public int getAverage(Property[] theArray) throws ParseException 
    {
    	//String[] sentences = theArray.split("$");  
        int total = 0,val=0;
        int avg = 0;
        String s[] = null;
        
        //------------------------------
        //1. Your code goes here; use the hint above if necessary 
        Prop propObj = new Prop();
        for (int i = 0; i <theArray.length; i++)
        {    
        	System.out.println(theArray[i].getPrice());
   //     val=Integer.parseInt(theArray[i].getPrice().split("$"));
        	System.out.println(s.length); 	 
        	 
        }
          
        return (avg);
    }

    //find and print the property details for property with MaxPrice
    public void displayMaxPrice(Property[] theArray) {
    	//------------------------------
	//2. Your code goes here. 

        
        

        	//-----------------------------
    }

    
    //display List of properties in Price Sorted Order from Min Price to Max Price
    public void displaySorted(Property[] theArray) {
   	//------------------------------
	//3. Your code goes here. 
        
        


//-----------------------------
    }

}


//—----------------------------------------------------------------
//
//
//Answer:
//paste your completed code here