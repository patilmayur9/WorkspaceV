/*Insurance
Int: id
String: personName
String: insuranceCompany
Void: getInsuranceDetails()
Void:
getInsuranceInformation()
*/
package com.velocity.multileveInheritance;

import java.util.Scanner;

public class Insurance 
{
	 static int id;
	static String personName;
	static String insuranceCompany;
	
	void getInsuranceDetails()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Insurance Class ");
		System.out.println("Enter the insurance holder Id : ");
		id=scanner.nextInt();
		System.out.println("Enter the insurance holder Name : ");
		personName=scanner.next();
		System.out.println("Enter the insurance company : ");
		insuranceCompany=scanner.next();
	}
	void getInsuranceInformation()
	{
		System.out.println(" Insurance Class ");
		System.out.println("Insurance holder id : "+id);
		System.out.println("Insurance holder Name : "+personName);
		System.out.println("Insurance company Name : "+insuranceCompany);
	}

}
