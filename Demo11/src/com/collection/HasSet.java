package com.collection;
import java.util.*;

public class HasSet 
{
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add("mayur");
		hs.add("Pratik");
		hs.add(null);
		hs.add(null);
		hs.add(10);
		
		System.out.println(hs);//[null, 10, mayur, Pratik]
		
		 
	}

}
