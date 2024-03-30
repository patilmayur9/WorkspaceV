package com.main;

import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	String booking;
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter which ticket is to be book  Economy-> 'E' AND Sleepar-> 'S'");
		booking = sc.nextLine();
		Booking bookingobj = BookingFactory.getTicketObject(booking);
		try { 
			System.out.println(booking+" class ticket is booked "+bookingobj.bookTicket());
		} catch (Exception e) {
			System.out.println("Exception catched");
		}
		System.out.println("normal flow f");
		
	}

}
