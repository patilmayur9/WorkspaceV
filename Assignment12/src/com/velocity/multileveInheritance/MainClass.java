
package com.velocity.multileveInheritance;

public class MainClass
{
	public static void main(String args[])
	{
		TermPolicy termpolicy=new TermPolicy();
		
		//calling parent class
		termpolicy.getInsuranceDetails();
		termpolicy.getInsuranceInformation();
		
		//calling child class
		termpolicy.getLifeInsuranceDetails();
		termpolicy.getLifeInsuranceInformation();
		
		//calling new child class
		termpolicy.getTermPolicyDetails();
		termpolicy.getTermPolicyInformation();
		
		System.out.println("In Main Class ");
		 
	}

}
