package com.collection.map;

 import java.lang.reflect.Field;
import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.LinkedHashMap;
//import java.util.Set;
//import java.util.TreeMap;

public class HashMapDemo
{
	public static void main(String[] args) throws Exception, SecurityException
	{
		//HashMap hm=new HashMap();
		//hm.put(10, "mayur");//when first data will added then initial capacity of hm is 16 otherwise it always 0
		
		/*
		 * //code of printing cpacity of HashMap Field tableField =
		 * HashMap.class.getDeclaredField("table"); tableField.setAccessible(true);
		 * Object[] table = (Object[]) tableField.get(hm); System.out.println(table ==
		 * null ? 0 : table.length);//print the capctiy
		 */	
		
		/*
		hm.put(20, "ravi");
		Object o=hm.put(30 , "value");
		System.out.println(o);//this will print null because heare is no replace ment occure
		Object o1=hm.put(20, "Pratik");//this will return old object and set key 20 as new object pratik
		System.out.println(o1);
		*/
		
		/*
		//add one hashmap into other hashmap
		hm.put(20, "mayur");
		hm.put(30, "Ezaz");
		
		HashMap hama=new HashMap<>(hm);
		System.out.println(hama);//{10=mayur, 20=mayur, 30=Ezaz}
		*/
		//putAll()
		HashMap hm=new HashMap<>();
		hm.put(1, "value");
		hm.put(2, "patil");
		hm.put(3, "mayur");
		 
		
		HashMap hm1=new HashMap<>();
		hm1.put(4,"abhi");
		hm1.put(5,"yogesh");
		hm1.put(6,"rahul");
		/*
		System.out.println("hm...."+hm);//hm....{1=value, 2=patil, 3=mayur}
		System.out.println("hm1...."+hm1);
		hm.putAll(hm1);
		System.out.println("hm=hm+hm1...."+hm);
		*/
		System.out.println("get method "+hm.get(2)); //get the value of whose key is 3
		
		System.out.println("remove method "+hm.remove(3));//remove the value of whose key is 4
		System.out.println(hm);
		
		System.out.println(hm.containsKey(3));//if key present then it return true other wise false//ture
		System.out.println(hm.containsKey(4));//false
		
		System.out.println(hm1.containsValue("rahul"));//true
		System.out.println(hm1.containsValue("patil"));//false
		
		System.out.println(hm1.isEmpty());
		System.out.println(hm.size());
		
		
	}
}
