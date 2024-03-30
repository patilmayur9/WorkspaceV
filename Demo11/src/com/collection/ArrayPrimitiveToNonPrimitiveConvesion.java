
/*
 * Arrays to collection 					    	   Arrays.asList(array name);//we can giv this is in arrayList constructor
 * normal version of collection to array			   arrylist naem.toArray();
 * Generic version of collection Object array 		return type is Object o   collection .toArray(argument);
 * */
package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPrimitiveToNonPrimitiveConvesion
{
	public static void main(String[] args) 
	{
		String str1[]= {"mayur","abhijit","om","ram","pradeep"};
		 List<String> al=new ArrayList<String>(Arrays.asList(str1));//hear we add string array in to ArrayList Constructor
		 al.add("mayur");
		 al.add("ram");
		 al.add("mayuri");
		 al.add("ramanand");
		 System.out.println(al);
		 
		String str []=new String[al.size()];
		 al.toArray(str);
		 for(String str11:str)
		 {
			 System.out.print(str11+"  ");
		 }
		System.out.println(str[0]);//mayur
		 
		
		ArrayList al1=new ArrayList<>();
		al1.add(1);
		al1.add(null);
		al1.add("mayur");
		al1.add("emp");
		al1.add( 10.5);
		al1.add(null);
		
		Object[] o=al1.toArray();
		for (Object oo:o)
		{
			if(oo!=null)
			System.out.print(oo+"\t");
		}
		
	}

}
