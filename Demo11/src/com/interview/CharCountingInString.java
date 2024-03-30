package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class CharCountingInString 
{
	public static void main(String[] args) {
		 String str="We can perform push, pop, peek and search operation on the stack."
		 		+ " The Java Stack class provides mainly five methods to perform these operations. ";
		 
		 HashMap<String, Integer>  hs = new HashMap<>();
		 
		 ArrayList<String> al= new ArrayList<String>();
		 for(int i = 0;i<str.length();i++) {
			 al.add(String.valueOf(str.charAt(i)));
		 }
		 
		 System.out.println("Count of String is " + al);
		 while(al.size()>0) {
			 String curr = (String)al.get(0).toString();
			 int cnt = 0;
			 
			 for(int j = 0;j<al.size();j++) {
				 if((boolean)al.get(j).equals(curr)) {
					 cnt++;
					 
					 --j;
				 }
				 
				 if(cnt>0) {
					 hs.put(curr, cnt);
				 }
				 for(int k = 0; k<al.size(); k++) {
					 al.remove(curr);
				 }
				 
				 
			 }
		 }
		 System.out.println("Count of String is " + hs);
		 
	}

}
