package com.collection;

import java.util.Collections;
import java.util.ArrayList;

public class CopyArrayListOneAnather {
	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		 
		System.out.println("al .... "+al);
		System.out.println("al1...  "+al1);
		al.addAll(al1);
		al1.addAll(al);
		System.out.println("al + al1  "+al);
		System.out.println("al1 + al  "+al1);
		
/*output al .... [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		 al1...  []
		 al + al1  [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		 al1 + al  [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
		*/
	}

}
