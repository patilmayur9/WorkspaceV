package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConversionCollectiontoArray 
{
	public static void main(String[] args) 
	{	
		//conversion of collection to array
		 ArrayList<String> al=new ArrayList<>();
		 al.add("mayur");
		 al.add("yogesh");
		 
		 String s[]=new String[al.size()];
		 
		 al.toArray(s);// collection to Array conversion
		 for(String ss:s)
			 
		 {
			 System.out.println(ss);
		 }
		 	
		/*//conversion of array to collection
		String str[]= {"mayur","patil","lad","wadkar"};
		ArrayList<String> al=new ArrayList<>(Arrays.asList(str));//array to collection
		al.add("ladu");
			System.out.println(al);*/	   	 
	}

}
