//====================================== This Is Custom Exception Class=============================================================
// Designed By:- Ravindra Palaskar
// If Available Product Quantuty in stock is less and Customer is trying to buy more Quantity then this Cusome Exception will through
// Invalid Quantity
//===================================================================================================================================
package com.velocity.Ecommerse;

public class InvalidInput extends Exception {

	private String massage;

	public InvalidInput(String massage) {
		super(massage);

	}

}
