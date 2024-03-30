/*SBIBank
double:
getCalculateInterest(double
principleAmount, int tenure,
float rateOfInterest)
void: getSBIBankDetails()
*/
package com.velocity.hierarchicalInheritance;

import java.util.Scanner;

public class SBIBank extends Bank
{
//	SBIBank sbibank=new SBIBank();
	Scanner scanner=new Scanner(System.in);
	
	void getSBIBankDetails()
	{
		SBIBank sbibank=new SBIBank();
		
		System.out.println("Enter the Principle Amount for sbi bank : ");
		sbibank.principleAmount=scanner.nextDouble();
		
		System.out.println("Enter the Tenure for sbi bank : ");
		sbibank.tenure=scanner.nextInt();
		
		System.out.println("Enter the rate Of Interest for sbi bank : ");
		sbibank.rateOfInterest=scanner.nextFloat();
	
	}
	double getCalculateInterest(double principleAmount, int tenure,float rateOfInterest)
	{
		double simpleInterest=((principleAmount*tenure*rateOfInterest)/100);
		
		return  simpleInterest;
	}
}
