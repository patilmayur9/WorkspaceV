package com.StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamClassJava8 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(4);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(29);
		//Calculate the sum of Square of Odd Number from Given List using Java 8 
		Integer list=al.stream().filter(a -> a%2 == 1).map(a -> a*a).reduce(0,(a,b) -> a+b);
		System.out.println(list); 
		//Calculate the sum of Square of Even Number from Given List using Java 8 
		Integer evenSum = al.stream().filter(a -> a%2 == 0).map(a -> a*a).reduce(0, (a,b) -> a+b);
		//Print the Word of Given string of Max Even length   (eg.This is  boy) This is Max even length Character
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		String arr[] = str.split(" ");
		String word = " ";
		System.out.println(word.length());
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()%2==0)
			{
				 
					if(arr[i].length()>word.length())
					{
						word=arr[i];
					}
				
			}
		}
		
		System.out.println(word);
		
	}

}
