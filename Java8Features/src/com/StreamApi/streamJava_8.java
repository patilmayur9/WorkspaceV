package com.StreamApi;

import java.util.ArrayList;
import java.util.Scanner;

public class streamJava_8 {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(20);
		al.add(15);
		al.add(29);
		//Calculate the sum of Square of Even Number from Given List using Java 8 
	Integer summm = al.stream().filter(a -> a%2 == 0).map(a -> a*a).reduce(0, Integer::sum);
	Integer sum=	al.stream().filter(a->a%2==0).map(a-> a*a).reduce(0, (a,b)->a+b);// .reduce(0, Integer::sum);
	Integer sum1 = al.stream().filter(a -> a%2==0).map(a -> a*a).reduce(0, (a,b)-> a+b); //reduce have first parameter is 0 and it is added to the after calculated the second parameter value 
	System.out.println("sum of Squer of Even Number sum -> "+sum);
	System.out.println("sum of Squer of Even Number sum1-> "+sum1);
	
	Integer suumOFList = al.stream().reduce(0,Integer::sum); 
	System.out.println("sum of array list is "+suumOFList);
		
	Integer temp=al.stream().filter(a->a%2==1).map(a->a*a).reduce(0,(a,b)->a+b); //I want to filter odd numbers only from List
	System.out.println("sum of Squer of Odd Number--> "+temp); 
	
	
	
	//Print the Word of Given string of Max Even length   (eg.This is  boy) 'This' word is Max even length Character
	System.out.println("Enter any string");
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	String arr[]=str.split(" ");

	String Even="";
	 
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i].length()%2==0 && arr[i].length()>Even.length() )
		{ 			 
//			if(arr[i].length()>Even.length())
//			{
				Even=arr[i];
//			}
		}
	}
	System.out.println(Even); 
	
	 
	
	//Print the Word of Given string of Max Even length
	System.out.println("Enter any sentense");
	String str1 = sc.nextLine();
	
	String [] strArray = str1.split(" ");
	String maxEven = "";
	for(int i = 0; i< strArray.length; i++) {
		if(strArray[i].length()%2 == 0) {
			if(strArray[i].length() > maxEven.length()) {
				maxEven = strArray[i];
			}
		}
	}
	System.out.println("max even length word of given string is "+  maxEven);
	
	} 
}
