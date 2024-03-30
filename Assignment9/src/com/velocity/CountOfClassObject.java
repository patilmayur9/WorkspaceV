//Write a java program in which create the multiple objects of class and
//display the count of number of objects are created in to a class
package com.velocity;
import java.util.Scanner;

public class CountOfClassObject
{  static int count; // variable created for count the objects of class
	CountOfClassObject()
	{
		count++;
	}
	public static void main (String args[])
	{
		//creating the  CountOfClassObject class object
		
		CountOfClassObject countofclassobject=new CountOfClassObject();
		CountOfClassObject countofclassobject1=new CountOfClassObject();
		CountOfClassObject countofclassobject2=new CountOfClassObject();
		CountOfClassObject countofclassobject3=new CountOfClassObject();
		CountOfClassObject countofclassobject4=new CountOfClassObject();
		CountOfClassObject countofclassobject5=new CountOfClassObject();
		CountOfClassObject countofclassobject6=new CountOfClassObject();
		CountOfClassObject countofclassobject7=new CountOfClassObject();
		CountOfClassObject countofclassobject8=new CountOfClassObject();
		  
 
		//printing the how many class objects are created in progeam
		 System.out.println(" CountOfClassObject class has an "+ count +" created in main method");
		
		
	}
}
