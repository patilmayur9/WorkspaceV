/*TermPolicy
Int: duration
Void: getTermPolicyDetails()
Void:
getTermPolicyInformation()*/
package com.velocity.multileveInheritance;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance
{
	int duration;
	
	Scanner scanner=new Scanner(System.in);
	
	void getTermPolicyDetails()
	{
		System.out.println(" TermPolicy Class ");
		System.out.println("Enter Duration of term policy insurance :  ");
		duration=scanner.nextInt();
	}
	void getTermPolicyInformation()
	{
		System.out.println(" TermPolicy Class ");
		TermPolicy termpolicy=new TermPolicy();
		System.out.println("Insurance holder id : "+termpolicy.id);
		System.out.println("Insurance holder Name : "+termpolicy.personName);
		System.out.println("Insurance company Name : "+termpolicy.insuranceCompany);
		System.out.println("Duration of term policy insurance is  : "+duration);
	}
}
