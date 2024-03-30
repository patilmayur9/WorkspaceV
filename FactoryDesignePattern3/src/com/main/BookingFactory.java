package com.main;

public class BookingFactory {
	
	public static Booking getTicketObject(String s) {
		if(s.equalsIgnoreCase("s")) {
			return new Sleepar();
		} else if (s.equalsIgnoreCase("e")) {
			return new Economy();
		} else {
			throw new  IllegalArgumentException("Invalid Input Please Enter Valid Input......");
		}
	}
	
	

}

class IllegalArgumentException extends RuntimeException {

	public IllegalArgumentException(String string) {
		super(string);
		System.out.println("in e class");
		// TODO Auto-generated constructor stub
	}
	
}
