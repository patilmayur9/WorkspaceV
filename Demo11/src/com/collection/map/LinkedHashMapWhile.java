package com.collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapWhile 
{
	public static void main(String[] args)
	{
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		 lhm.put(10, "mayur");
		 lhm.put(10, "patil");//override first key 10 mayur
		 //lhm.put(null,"mayur");//Exception in thread "main" java.lang.NullPointerException
								//at com.collection.map.LinkedHashMapWhile.main(LinkedHashMapWhile.java:22)
		 
		 lhm.put(9, null);
		 
		 System.out.println(lhm);//{10=patil}
		 Set<Integer> setobj= lhm.keySet();
		  Iterator<Integer> itr=setobj.iterator();
		  
		  while(itr.hasNext())
		  {
			  int i=itr.next();
			  System.out.println("key..."+i);
			  System.out.println("value."+lhm.get(i));
			/*
			 * output key...10 value.patil
			 * 
			 * output key...10 value.patil
			 *  key...9 value.null
			 */
		  }
		 
	}

}
