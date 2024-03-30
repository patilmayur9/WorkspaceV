/*HDFCBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest()
void: getHDFCBankDetails()*/
package com.velocity.hierarchicalInheritance;

import java.util.Scanner;

public class HDFCBank extends Bank
{
//	HDFCBank hdfcbank=new HDFCBank();
	Scanner scanner=new Scanner(System.in);
	
	void  getHDFCBankDetails()
	{
		HDFCBank hdfcbank=new HDFCBank();
		
		System.out.println("Enter the Principle Amount for hdfc bank : ");
		hdfcbank.principleAmount=scanner.nextDouble();
		
		System.out.println("Enter the Tenure for hdfc bank : ");
		hdfcbank.tenure=scanner.nextInt();
		
		System.out.println("Enter the rate Of Interest for hdfc bank : ");
		hdfcbank.rateOfInterest=scanner.nextFloat();
				
	}
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest)
	{
		double simpleInterest=((principleAmount*tenure*rateOfInterest)/100);
		return  simpleInterest;
	}

}
