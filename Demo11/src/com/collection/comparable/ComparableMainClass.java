package com.collection.comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableMainClass 
{
	public static void main(String[] args) {
		ArrayList<Emp> al=new ArrayList<>();
		al.add(new Emp(1,"mayur"));
		al.add(new Emp(2,"suraj"));
		al.add(new Emp(3,"yogesh"));
		al.add(new Emp(4,"abhijit"));
		
		Collections.sort(al);
		for(Emp a: al)
		{
			System.out.println(a.id+"  "+a.name);
		}
	}

}
