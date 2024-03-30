package com.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapArrayList {
	public static void main(String[] args) {
		List<String> computeraccessories = new ArrayList<String>();
		computeraccessories.add("watch");
		computeraccessories.add("speaker");
		computeraccessories.add("laptop");
		
		List<String> electronics = new ArrayList<String>();
		electronics.add("printer");
		electronics.add("keyboard");
		electronics.add("mouse");
		
		ArrayList<String> furniture = new ArrayList<String>();
		furniture.add("bed");
		furniture.add("chair");
		furniture.add("sofa");
		/*
		 * HashMap hm=new HashMap(); hm.put("ajay",20); hm.put("sachin",50);
		 */
// categories as key and value as ArrayList
		HashMap<String, List<String>> categories = new HashMap<String, List<String>>();
		categories.put("Computer", computeraccessories); // passing arraylist as value
		categories.put("Electronics", electronics);
		categories.put("Furniture", furniture);
// eshop as key-string, value as HashMap
		HashMap<String, HashMap<String, List<String>>> eshop = new HashMap<String, HashMap<String, List<String>>>();
		eshop.put("E Shop", categories);
// how to iterate
		Set<String> s = eshop.keySet(); // only key s contain E shop
		for (String str : s) {
			System.out.println(str); // key
			System.out.println(eshop.get(str));
//System.out.println(eshop.get(str)); //value-eshop.get(E shop)--print
		}
	}
}