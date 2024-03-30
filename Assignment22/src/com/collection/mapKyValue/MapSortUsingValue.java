/*1. Suppose I have Map<String,Integer> contain key as 
 * Ram, Sohan, Ashok, Ajay, Prasanna and 
 * value is 3,2,1,6,5 now 
 * I want to sort the value from map and print it.*/
package com.collection.mapKyValue;

import java.util.Map.Entry;
import java.util.*;
import java.util.LinkedHashMap;
import java.util.LinkedList;

 
public class MapSortUsingValue 
{
	public static void main(String[] args) 
	{
		/* 
	 	HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Ram", 3);
		hm.put("Sohan", 2);
		hm.put("Ashok", 1);
		hm.put("Ajay", 6);
		hm.put("Prasanna", 5);
		System.out.println(hm);*/
		
		Map<String, Integer> map=new LinkedHashMap<String, Integer>();//hear we use map because
		map.put("Ram", 3);											//map has set method to replace the entry element this is usefull
		map.put("Sohan", 2);										//for us to interchange postion to entrys for sorting
		map.put("Ashok", 1);
		map.put("Ajay", 6);
		map.put("Prasanna", 5);
		//System.out.println(map);												 
														
		
		Set<Entry<String, Integer>> entry= map.entrySet();		 
	  //System.out.println(entry);//[Ram=3, Sohan=2, Ashok=1, Ajay=6, Prasanna=5]
		
		 //convet the total entry in to list for sorting pourpose
		 List<Entry<String, Integer>> list=new LinkedList<Entry<String, Integer>>(entry);
		 System.out.println("Before Sorting ");
		 System.out.println(list);//[Ram=3, Sohan=2, Ashok=1, Ajay=6, Prasanna=5]
		
	 
		 for(int i=0;i<list.size();i++)
		 {
			 for (int j=i+1;j<list.size();j++)
			 {
				 if(list.get(i).getValue() > list.get(j).getValue())
				 {
					 Entry <String,Integer> temp=list.get(i);
					 
					 list.set(i, list.get(j));
					 list.set(j, temp);
					 
					  
				 }
			 }
		 }
		
		 
		Map<String, Integer> output=new LinkedHashMap<String, Integer>();
		for(Entry<String, Integer> a:list)
		{
			output.put(a.getKey(), a.getValue());
		}
		
		System.out.println("After sorting using value");
		System.out.print(output);
	}

}

/*
TreeMap<String, Integer> hm=new TreeMap<String, Integer>();
hm.put("Ram", 3);
hm.put("Sohan", 2);
hm.put("Ashok", 1);
hm.put("Ajay", 6);
hm.put("Prasanna", 5);
System.out.println(hm);//output it always sort using key  {Ajay=6, Ashok=1, Prasanna=5, Ram=3, Sohan=2}
*/
