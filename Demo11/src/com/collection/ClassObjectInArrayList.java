package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ClassObjectInArrayList {
	public static void main(String[] args) {
		ArrayList<Eemployee> al=new ArrayList<Eemployee>();
		
		Eemployee e=new Eemployee(1,"pratic","20,000");
		al.add(e);//we can add data this way also
		
		al.add(new Eemployee(1,"mayur","10,000"));//we can add data this way also
		
		Iterator<Eemployee> itr=al.iterator();//by using iterator method
		while(itr.hasNext())
		{
			System.out.println("Employee list is "+itr.next());
		}
		
		for (Eemployee e1:al)
		{
			System.out.println(e1);
		}
	}

}
