package com.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapUsingWhile 
{
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(10, "Mayur");
		hm.put(9, "ram");
		hm.put(12, "seeta");
		
		Set<Integer> setobj= hm.keySet();//it always give output as a assending order of key 
		Iterator<Integer> itr=setobj.iterator();
		int i=0;
		while(itr.hasNext())
		{
			 i=itr.next();
			 System.out.println("key.."+i);
			 System.out.println("value.."+hm.get(i));
			/*output
			 * key..9 value..ram
			 * key..10 value..Mayur
			 *key..12 value..seeta
			 */
		}
		
	}

}
