package com.Pratik.interview.Questions;

//public class Property {
//
//}


//Creating a Property class with
//mlsid, name, and price as a attributes
class Property {

	public int mlsid;
	public String name;
 	public String price;

	// Property class constructor
	Property(int mlsid, String name, String price)
	{
		this.mlsid = mlsid;
		this.name = name;
     		this.price = price;
	}

	// display() method to display
	// the Property data
	public void display()
	{
		System.out.println("Property mlsid is: " + mlsid
						+ ", Name: "
						+ name
						+ ", Price: "
						+ price);
	}

 public String getPrice()
 {
     return price;
 }
}