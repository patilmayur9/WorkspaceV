/*ICICIBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getICICIBankDetails()*/
package com.velocity.hierarchicalInheritance;

import java.util.Scanner;

public class ICICIBank extends Bank
{
	//ICICIBank icicibank=new ICICIBank();
	Scanner scanner=new Scanner(System.in);
	void getICICIBankDetails()
	{
		ICICIBank icicibank=new ICICIBank();
		
		System.out.println("Enter the Principle Amount for icici bank : ");
		icicibank.principleAmount=scanner.nextDouble();
		
		System.out.println("Enter the Tenure for icici bank : ");
		icicibank.tenure=scanner.nextInt();
		
		System.out.println("Enter the rate Of Interest for icici bank : ");
		icicibank.rateOfInterest=scanner.nextFloat();
		
		
	}
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest)
	{
		double simpleInterest=((principleAmount*tenure*rateOfInterest)/100);
		
		return  simpleInterest;
	}
}
 
