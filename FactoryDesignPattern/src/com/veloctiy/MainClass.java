package com.veloctiy;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		String booking;
		try
		{	 
		System.out.println("Select ticket you Want to buy -> GN, AC, 2Tear, 3Tear");
		Scanner sc=new Scanner(System.in);
		booking=sc.next();
		
		Booking b=BookingFactory.getTicket(booking);
		  
		System.out.println(b.BookTicket());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e);
		}
	}

}
