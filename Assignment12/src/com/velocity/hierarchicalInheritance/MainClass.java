package com.velocity.hierarchicalInheritance;

import java.util.Scanner;

public class MainClass
{
	static double interest;
	public static void main(String args[])
	{
		//calling method of icici bank without parameter	
		ICICIBank icicibank=new ICICIBank();
		icicibank.getICICIBankDetails();
		interest=icicibank.getCalculateInterest(icicibank.principleAmount,icicibank.tenure,icicibank.rateOfInterest);
		System.out.println("The icici bank interest is : "+interest);	
		

		//calling method of sbi bank without parameter	
		SBIBank sbibank=new SBIBank();
		sbibank.getSBIBankDetails();	
		interest=sbibank.getCalculateInterest(sbibank.principleAmount,sbibank.tenure,sbibank.rateOfInterest);
		System.out.println("The sbi bank interest is : "+interest);
		
		
		//calling method of hdfc bank without parameter		
		HDFCBank hdfcbank=new HDFCBank();
		hdfcbank.getHDFCBankDetails();
		interest=hdfcbank.getCalculateInterest(hdfcbank.principleAmount,hdfcbank.tenure,hdfcbank.rateOfInterest);
		System.out.println("The hdfc bank interest is : "+interest);		
		
		
		System.out.println("End of main method ");
		
	}
	
}












////calling method of sbi bank with parameter
//
//Scanner scanner=new Scanner(System.in);
//
//System.out.println("Enter principle amount for sbi bank : ");
//sbibank.principleAmount=scanner.nextDouble();
//
//System.out.println("Enter Tenure for sbi bank : ");
//sbibank.tenure=scanner.nextInt();
//
//System.out.println("Enter Rate of interest for sbi bank : ");
//sbibank.rateOfInterest=scanner.nextFloat();
//float rateOfInterest;
