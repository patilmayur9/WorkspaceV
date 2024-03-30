package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ReturnMapToMethod
{
	public static void main(String[] args) 
	{
		ReturnMapToMethod classobject=new ReturnMapToMethod();//create class object
		System.out.println(classobject.returnHashMap());//1st way calling method//{1=mayur, 2=Rahul, 3=yogesh}
		
		Map<Integer, String> map=classobject.returnHashMap();//2nd way calling method
		System.out.println(map);//{1=mayur, 2=Rahul, 3=yogesh}
		
		HashMap<Integer, String> hm=classobject.returnHashMap();//3nd way calling method
		System.out.println(hm);//{1=mayur, 2=Rahul, 3=yogesh}
		
	}
	
	public HashMap<Integer, String> returnHashMap()
	{
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "mayur");
		hm.put(2, "Rahul");
		hm.put(3, "yogesh");
		return hm;
	}
}
