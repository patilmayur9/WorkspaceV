/*1. Design the method which return the list that contain the element as Ram, 
 * Sohan, Ashok, Ajay, Prasanna now I want to sort that element based on descending order.*/
package com.collection;

import java.util.ArrayList;
//import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;

public class ArrayListSortingAsseOrder 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = arrayListMethod();
		 
		TreeSet   ts=new  TreeSet (list);//default tress set sort the elements using some sorting order so we use that functionality
		//String str[]=new String[ts.size()];
		 
		 
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			 System.out.print(itr.next()+" "); ;
		} 
		//System.out.println(ts);//[Ajay, Ashok, Prasanna, Ram, Sohan]
	}
	
	public static ArrayList<String> arrayListMethod()
	{
		ArrayList<String> alist=new ArrayList<String>();
		alist.add("Ram");
		alist.add("Sohan");
		alist.add("Ashok");
		alist.add("Ajay");
		alist.add("Prasanna"); 
		return alist;
		
	}
}
