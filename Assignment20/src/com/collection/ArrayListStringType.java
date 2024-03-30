/*2. Design the generics arraylist for string and add five cities into it 
 * and iterate that using for each loop.*/
package com.collection;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListStringType {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter five cities ");
		for(int i=0;i<5;i++)
		{
			str=sc.nextLine();
			al.add(str);
		}
	 
		
		for(String str1:al)
		{
			System.out.println(str1);
		}
		
	}

}
