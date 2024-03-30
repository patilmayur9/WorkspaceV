package com.funtionalInterface.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface 
{
	public static void main(String[] args) {
		Predicate<String> predObj=(s) -> (s.length()<5);
//		Predicate<String> p = (a) -> (a.length()>5);
//		System.out.println(p.test("mayur"));
		
//		predObj.test("MAyuri");
//		System.out.println(predObj.test("MAyuri"));
		
		boolean b=predObj.test("MAyuri");
		System.out.println(b);
		
		
		Predicate<String>p=(s)->s.length()>5;
		System.out.println(p.test("MayurPatil"));
		
		/*//Prog- Sum of list of integers using predicate
		List<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		predicate<Integer>al1=(s)-> s=s+s*/
	}

}
