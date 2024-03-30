package com.immutableclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		//create the student object and assigne the final variables
		List<String> list = new ArrayList<>();
		list.add("Suraj");
		list.add("Vijay");
		list.add("Amar");
		list.add("Rakesh");
		Student s = new Student("mayur", "patil", "Nippani",  list);
		
		// access the student fields using get method
		System.out.println(s.getFirstName());
        System.out.println(s.getLastName());
        System.out.println(s.getCity());
        System.out.println(s.getList()); 
        
        // this element is added in this class list but not added in student class list field
        list.add("pappu");
        System.out.println(list);
        System.out.println(s.getList());
        
        
        // we can not add this one also 
       s.getList().add("Tingu");
       System.out.println(s.getList());
        
        //
        
        
	}

}
