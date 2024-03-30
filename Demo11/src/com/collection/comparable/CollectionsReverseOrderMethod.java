package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsReverseOrderMethod 
{
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
		al.add("sravya");
		
		System.out.println("Before Sorting  "+al);
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("after sorting  "+al);
}

}
