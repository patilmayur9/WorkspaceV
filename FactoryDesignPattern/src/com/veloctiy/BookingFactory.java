package com.veloctiy;

public class BookingFactory {
	public static Booking getTicket(String input)  
	{
		 if(input.equalsIgnoreCase("GN"))
		 {
			 return new GenralClass();
		 } 
		 else if(input.equalsIgnoreCase("AC"))
		 {
			 return new AcClass();
		 }
		 else if(input.equalsIgnoreCase("2Tear"))
		 {
			 return new TwoTear();
		 }
		 else if(input.equalsIgnoreCase("3Tear"))
		 {
			 return new ThreeTear();
		 }
		 throw new  IllegalArgumentException("Invalid Input Please Enter Valid Input......");
		
	}

}
