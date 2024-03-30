package com.raviSirProgram;

public class ArmstrongNumber
{
	public static void main(String[] args) {
	int a=152;	
	int result=a;
	int arm=0,temp=0;
	while(a>0)
	{
		 temp=a%10;
		 arm=arm+(temp*temp*temp);
		a=a/10;
	}
	if(result==arm)
	{
		System.out.println("armstrong");
	}
	else
	{
		System.out.println("not armstrong");
	}
	}
}
