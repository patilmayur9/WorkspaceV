package com.veloctiy;

public class fibonecciSeries 
{
	public static void main(String[] args) {
		int j=10;
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<=j;i++)
		{
			a=a+b;
			System.out.println(a+" ");
			int temp=a;
			a=b;
			b=temp;
			
		}
	}

}
