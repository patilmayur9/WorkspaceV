package com.collection.map;

import java.util.HashMap;
import java.util.Set;

public class HashMapIteracton
{
	public static void main(String[] args) {
	
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "mayur");
		hm.put(2, "patil");
		hm.put(3, "Pratik");
		hm.put(4, "Sonawane");
		hm.put(5, "Shridhar");
		
		System.out.println(hm);//{1=mayur, 2=patil, 3=Pratik, 4=Sonawane, 5=Shridhar}
		
		Set<Integer> obj=hm.keySet();//use of keySet()
		//itrate using for each loop 
		for(Integer a:obj)
		{
			 System.out.print(a+" ");//1 2 3 4 5 
			System.out.print(hm.get(a)+" ");//mayur patil Pratik Sonawane Shridhar 
		}
	}

}
