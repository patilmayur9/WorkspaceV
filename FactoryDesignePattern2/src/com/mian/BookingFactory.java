package com.mian;

public class BookingFactory {
	public static Booking getTicket(String ticket) {
		if(ticket.equalsIgnoreCase("E")) {
			return new Economy();
		} else if (("PE").equalsIgnoreCase(ticket)) {
			return new PrimumEconomy();
		} else if(("BC").equalsIgnoreCase(ticket)) {
			return new BusinessClass();
		} else {
			 throw new IllegalArgumentException("in valid input please enter a valid input "+ ticket);
		}
		 
	}

}
