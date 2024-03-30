package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Demo   //Comparable<ArrayList<Integer>>
{
	public static void main(String[] args) 
	{
		 ArrayList<StringComparableInterview> al=new ArrayList<StringComparableInterview>();
		 al.add(new StringComparableInterview(1,"omkar","10000") );
		 al.add(new StringComparableInterview(2,"Akshay","3000") );
		 al.add(new StringComparableInterview(3,"z","50000") );
		 al.add(new StringComparableInterview(4,"Khalid","11000") );
		 
		 Collections.sort(al);
		 for(StringComparableInterview a:al)
		 {
			 System.out.println(a);
		 }
		  
		 
		 		 
	}

	 
	
	
	
	 

}
