//HashSet internal woriking using break point 
package com.collection;
//import java.util.*;
import java.util.HashSet;

public class HashSetInternalWorking
{ 
	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		hs.add("java");
		hs.add(10);
		hs.add(1001);
		System.out.println(hs);
		
		System.out.println(hs.add(10));//duplicates are not allowed//false
		System.out.println(hs.add(null));//true
		System.out.println(hs.add(null));//false only one null value is allowed
	}

}
