package com.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorClass 
{
	public static void main(String[] args) {
		ArrayList<Employ> al=new ArrayList<>();
		al.add(new Employ(1, "mayur", 23000));
		al.add(new Employ(2, "suraj",15000));
		al.add(new Employ(3,"chintu",  33000));
		
		Collections.sort(al, new Employe());
		
		for(Employ e:al)
		{
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.sallary);
		}
	}

}
