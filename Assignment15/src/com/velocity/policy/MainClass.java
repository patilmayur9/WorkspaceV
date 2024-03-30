package com.velocity.policy;

public class MainClass 
{
	public static void main (String args[])
	{
	   Policy policy=new Policy();
		Policy polices=policy.getPolicyDetails();
		System.out.println("Policy Data is : "+polices);
	}

}
