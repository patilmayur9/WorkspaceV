/*2.Suppose I have one container that contain  different colors of ballons such as 
 * Red, Blue, Green, Red,Blue,Red, Blue, Green 
 * in this order, now sort that baloon in such manner so
 *  Red baloon will be added first then Blue baloon and last is Green balloons.
 *   Use the proper collection.*/
package com.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class BaloonSorting
{
	public static void main(String[] args) {
		ArrayList<String> ts=new ArrayList<String>();		
		ts.add("Red");
		ts.add("Blue");
		ts.add("Green");
		ts.add("Red");
		ts.add("Blue");
		ts.add("Red");
		ts.add("Blue");
		ts.add("Green");
		System.out.println(ts);
		
		ArrayList<String> ts1=new ArrayList<String>();	
		ts1.add("Red");
		ts1.add("Blue");
		ts1.add("Green");		
		//System.out.println( ts1.size());
		
		ArrayList<String> list=new ArrayList<String>();
		 for(int i=0;i<ts1.size();i++)
		 { 
			 for(int j=0;j<ts.size();j++)
			 {
				 if(ts1.get(i)==ts.get(j))
				 {
					 list.add(ts.get(j));
				 }
			 }
			 
		 }
		System.out.print(list);
		
	}
}
