package com.collection.map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Set;
import java.util.*;
import java.lang.*;
 
import java.util.Iterator;
 

public class HashMapCapacity {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		HashMap hm=new HashMap<>();
		hm.put(0, "j");
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		hm.put(6, "f");
		hm.put(7, "g");
		hm.put(8, "h");
		hm.put(9, "i");		
		hm.put(10, "k");
		hm.put(11, "l");
		hm.put(12, "m");
		//hm.put(null, "n");//hear capacity will be 32 double of 16 becouse  13 element added
		
		/*hm.put(-1, "k");//-is allowed hear
		hm.put(-2, "l");*/
		/*System.out.println(hm);//{0=j, 1=a, 2=b, 3=c, 4=d, 5=e, 6=f, 7=g, 8=h, 9=i, 10=k, 11=l, 12=m, 13=n}
		
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(hm);
		System.out.println(table == null ? 0 : table.length);//32
		
		System.out.println(hm.get(null));//n
		*/
		
		Set<Integer> set=hm.keySet();
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			int i =(int) itr.next();
			 
			 System.out.print("keys ... "+i+" ");
			 System.out.println();
			 System.out.print("values... "+hm+" ");
			 
		}
	}

}
