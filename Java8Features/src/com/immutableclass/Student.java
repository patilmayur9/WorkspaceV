package com.immutableclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Student {
	//make class as final, no one can extend this class
	//set all fields as a private so no direct access outside of class
	private   final String firstName  ;
	private   final String lastName  ;
	private   final String city ;
	private   final List<String> list  ;
	
	public Student(String firstName, String lastName, String city, List<String> l) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		
		//Collections.unmodifiableList(this.list=l);// this way also we can use
		// create a deep copy if your field having a object type data
		 List<String> list1 = new ArrayList<>();
		 for(String s: l) {
			 list1.add(s);
		 }
		 
		 this.list = list1;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCity() {
		return city;
	}

	public List<String> getList() {
		
		 List<String> list1 = new ArrayList<>();
		 for(String s: this.list) {
			 list1.add(s);
		 }
		 
		  
		return list1;
		// if we use this line then at the time of adding new data in to list it throws error 
		//return Collections.unmodifiableList(list);// Exception in thread "main" java.lang.UnsupportedOperationException
	}
	
	// no setter methods allowed 
	
	  

}
