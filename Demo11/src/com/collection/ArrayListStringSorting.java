package com.collection;
import java.util.ArrayList;
import java.util  . Collections;
public class ArrayListStringSorting 
{
	public static void main(String[] args) 
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("mayur");
		al.add("patil");
		al.add("yogesh");
		al.add("wadkar");
		al.add("Shridhar");//S is capital hear in Shridhar so it takes first object
		al.add("chougule");
		al.add("khalid ");//NOTE  Capital letter get higher priority than small letter 
		al.add("mujawar");
		al.add("avinash");
		al.add("chougule");
		al.add("rahul");
		al.add("Patil");//P is capital hear in Patil so it takes first object
		System.out.println(al);
		Collections.sort(al);;
		System.out.println(al);
	}

}
