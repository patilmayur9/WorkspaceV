/*LifeInsurance
Int: premiumAmount
Void: getLifeInsuranceDetails()
Void:
getLifeInsuranceInformation()
*/
package com.velocity.multileveInheritance;

import java.util.Scanner;

public class LifeInsurance extends Insurance
{
	 static int premiumAmount;

	Scanner scanner=new Scanner(System.in);
	void getLifeInsuranceDetails()
	{
		System.out.println(" LifeInsurance Class ");
		System.out.println("Enter the life insurance premium Amount :  ");
		premiumAmount=scanner.nextInt();
		
	}
	void getLifeInsuranceInformation()
	{
		System.out.println(" LifeInsurance Class ");
		
		LifeInsurance lifeinsurance=new LifeInsurance();
		System.out.println("Insurance holder id : "+lifeinsurance.id);
		System.out.println("Insurance holder Name : "+lifeinsurance.personName);
		System.out.println("Insurance company Name : "+lifeinsurance.insuranceCompany);
		System.out.println("Life insurance premium Amount is : "+premiumAmount);
		
	}
}
