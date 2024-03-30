 /*1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
1.2 Design the below method into Policy class and which return the policy object
public Policy getPolicyDetails() 
1.3 Input should be taken from user and print that data into getPolicyDetails () method. */

package com.velocity.policy;
import java.util.Scanner;

public class Policy 
{
	//instance variable declaration
	private int policyId;
	private String policyName;
	private String policyType;
	private int premiumAmount;
	
	public int getId ()
	{
		return policyId;
	}
	public void setId(int policyid)
	{
		this.policyId=policyid;
	}
	
	
	public String getPolicyName()
	{
		return policyName;
	}
	public void setPolicyName(String policyName)
	{
		this.policyName=policyName;
	}
	
	public String getPolicyType()
	{
		return policyType;
	}
	public void setPolicyType(String policyType)
	{
		this.policyType=policyType;
	}
	
	public int getpremiumAmount()
	{
		return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount)
	{
		this.premiumAmount=premiumAmount;
	}
	
	
	public Policy getPolicyDetails() //method return type is policy class or this method is static then we use class object for accessign the globale variables
	{
		Scanner scanner=new Scanner(System.in);
		Policy policy=new Policy();//Policy Class object are created 
		
		System.out.println("Enter the Policy Id : ");
		policyId=scanner.nextInt();
		
		System.out.println("Enter the Policy Holder Name : ");
		policyName =scanner.next();
		
		System.out.println("Enter Policy type : ");
		 policyType=scanner.next();
		
		System.out.println("Ente the Policy Premium Amount : ");
		 premiumAmount=scanner.nextInt();
		
		policy.setId(policyId);
		policy.setPolicyName(policyName);
		policy.setPolicyType(policyType);
		policy.setPremiumAmount(premiumAmount);
		
		//return the Policy Class object
		return policy;					// new Policy(); also we can use this type with returning parameters 
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}

	 

}
