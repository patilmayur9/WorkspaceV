/*2.Suppose I have one container that contain  different colors of ballons such as Red,
 *  Blue, Green, Red,Blue,Red, Blue, Green in this order,
 *   now sort that baloon in such manner so Red baloon will be added
 *  first then Blue baloon and last is Green balloons. Use the proper collection.*/
package com.collection;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;
//import java.util.*;

public class SetExmaple 
{
	public static void main(String[] args)
	{
		ArrayList<String> ss=new ArrayList<String>();
		ss.add("Red");
		ss.add("Blue");
		ss.add("Green");
		ss.add("Red");
		ss.add("Blue");
		ss.add("Red");
		ss.add("Blue");
		ss.add("Green");
		System.out.println(ss);
		 TreeSet<String> ts=new TreeSet<String>(ss);
		 System.out.println(ts);
		
	}

}
