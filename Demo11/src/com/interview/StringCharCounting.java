package com.interview;
import java.util.HashMap;
public class StringCharCounting {
	 

//code by rajan hande
	 

		public static void main(String[] args) {
			String s="Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) "
					+ "in the year 1995. James Gosling is known as the father of Java. Before Java, its "
					+ "name was Oak. Since Oak was already  a registered company, so James Gosling and his team changed the name from Oak to Java";
			
			s.replaceAll("[0-9]", "");
			s.replaceAll(" ", "");
			
			String arr[] =new String[s.length()];
			HashMap<String, Integer> hm=new HashMap<String,Integer>();
			
			for(int i=0;i<arr.length;i++) {
				arr[i]=String.valueOf(s.charAt(i));
			}
			for(String ss:arr) {
				Integer integer=hm.get(ss);
	;
				if(integer ==null) {
					hm.put(ss, 1);
				}
				else {
					hm.put(ss, integer+1);
				}
			}
			System.out.println(hm);
		}
	 

}
