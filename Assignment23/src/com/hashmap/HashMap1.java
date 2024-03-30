/*Design the below example by using HashMap<String, ArrayList<String>>
 * 
 * Assignments 23
1. Design the below example by using HashMap<String, ArrayList<String>>
								  India
		 ________________________/	|  \____________________________
		/							|								\
	Maharashtra					 Karnataka 						Madhya Pradesh
   /	|	  \ 				 /		 \				  		/			\
Mumbai Pune Nagpur			 Bangalore  Mysore                 Bhopal       Indore
*/
package com.hashmap;

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;*/
import java.util.*;


public class HashMap1
{
	public static void main(String[] args) {
		List<String> maharashtra=new ArrayList<String>();
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		
		List<String> karnataka=new ArrayList<String>();
		karnataka.add("Bangalore");
		karnataka.add("Mysore");
		
		List<String> madhysPradesh=new ArrayList<String>();
		madhysPradesh.add("Bhopal");
		madhysPradesh.add("Indore");
		
		//HashMap for States and combining for its cities
		HashMap<String, List<String>> state=new HashMap<String, List<String>>();
		state.put("Maharashtra", maharashtra);//adding array list as a value in hashmap
		state.put("Karnataka", karnataka);
		state.put("MadhysPradesh", madhysPradesh);
		
		//hash map for country and comining for its states
		HashMap<String, HashMap<String, List<String>>> india=new HashMap<>();
		 india.put("India", state);//state is act like a value of key India
		 
		 Set<String> s=india.keySet();
		 
		 for (String str:s)
		 {
			 System.out.println(str);
			 System.out.println(india.get(str));
		 }

		
	}
}
