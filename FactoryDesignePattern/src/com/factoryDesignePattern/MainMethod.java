package com.factoryDesignePattern;

import java.util.Scanner;

public class MainMethod 
{
public static void main(String[] args) {
	System.out.println("Enter your choice Ac: 1Tear, 2Tear, 3Tear ");
	Scanner sc=new Scanner(System.in);
	String choice=sc.next();
	
	Booking result=FactoryMethod.getTicket(choice);
	System.out.println(result.BookTicket());
}
}
