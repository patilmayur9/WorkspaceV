package com.ForEachLoop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ForEachLoop {
	
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "mayur");
		map.put(2, "kedar");
		map.put(3, "patil");
		map.put(4,"sonya");
	 
		map.forEach((k,v) -> System.out.print(k+"--"+v));
		
		map.forEach((k,v) ->{
			System.out.println("key is "+k+" and value is "+v);
		});
		
		List list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add("mayuur");
		list.add("\"\"\\");
		list.forEach(System.out::println);
		//list.stream().map(a -> System::println(a));
		
		Map<String, Integer> map1=new HashMap<>();
		map1.put("Pappu", 1);
		map1.put("akshay", 2);
		map1.put("patil", 3);
		
		map1.forEach((k,v) -> {
		//	System.out.println("&&"+k+v);
			});
		
	 
		
		 Stream<String> stream 
         = Stream.of("Geeks", "For", 
                     "Geeks", "A", 
                     "Computer", 
                     "Portal");
	}

}
