package com.mian;

import java.util.Scanner;

public class MainClass {
	public static void main(String []args) {
		String booking;
		
		System.out.println("Which ticket you want to book Economy(E), Primum Economy(PE), Business Class(BC)");
		Scanner sc= new Scanner(System.in);
		booking = sc.nextLine();
		try {
		Booking b = BookingFactory.getTicket(booking);
		System.out.print("run time class object is created -> "+b.getClass().getName() +"\n");
		System.out.println(b.bookTicket()); 
		} catch(Exception e) {
			System.out.println("exception is "+e);
		}
	}
}
