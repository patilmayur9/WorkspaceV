package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapUsignItrator
{
	public static void main(String[] args) 
	{
		 Map<String, String> map=new HashMap<String, String>();//holding the child object by parent refrance
		 map.put("mayur", "patil");
		 map.put("ajay", "deshmukh");
		 
		 Iterator<Map.Entry<String, String>> itr=map.entrySet().iterator();
		 
		 while(itr.hasNext())
		 {
			 Map.Entry<String, String> entry=itr.next();
			 System.out.print( entry.getKey()+" ");
			 System.out.print(entry.getValue()+" ");
			 //ajay deshmukh mayur patil    //output
		 }
		 
		 // forEach(action) method to iterate map
		 map.forEach((k,v) -> System.out.println("key.."+ k +" value.. "+v));//key..mayur value.. patil//ouput
		 
		 //using for each loop
		 Set<String> s=map.keySet();
		 for(String s1: s)
		 {
			 System.out.println("key is "+s);
			 System.out.println("Value is "+map.get(s));
			/*output
			 * key is [ajay, mayur] Value is null key is [ajay, mayur] Value is null
			 */
		 }
	}

}
