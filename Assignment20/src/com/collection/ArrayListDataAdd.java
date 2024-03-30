/*1. Write program to add the five students mobile number into 
 * arraylist and iterate that elements using iterator. */
package com.collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ArrayListDataAdd {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 5 contact no ");
		String str;
		for(int i=0;i<5;i++)
		{
			str=sc.nextLine();
			al.add(str);
			
		}
		/*al.add("1234567899");
		al.add("4567899123");
		al.add("4561237899");
		al.add("6789123459");
		al.add("5678991234");*/
		
		Iterator<String> itr=al.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
		 }
		
	}

}
