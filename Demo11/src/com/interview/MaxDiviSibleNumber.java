package com.interview;

import java.util.Scanner;

public class MaxDiviSibleNumber
{
	public static void main(String[] args) {
		int a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two numbers to calculate max divisible number : ");
		int num1=sc.nextInt();//10
		int num2=sc.nextInt();//20
		int small;
		if(num1<num2)
		{
			small=num1;
		}
		else
		{
			small=num2;
		}
		 
		int min=0;//for samllest divisible number
		for(int i=small;i>1;i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				 min=i;
			}
		}
		
		 System.out.println("samllest divisible of two number is "+min);
		
		/*int max=0;//for gretest divisible number
		for(int i=1;i<small;i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				 max=i;
			}
		}
		
		 System.out.println("gretest divisible of two number is "+max);*/
	}

}











































/*		a= new int[size];
System.out.println("Enter Array element");
for(int i=0;i<size;i++)
{
	a[i]=sc.nextInt();
	//System.out.print (a[i]+" ");
}

System.out.println("Smallest Element in array is : ");
for(int i=0;i<size;i++)
{
	for(int j=i+1; j<size; j++)
	{
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}	
int half=0;
if(a[0]%2==0)
{
	  half=a[0]/2;
}
else
{
	  half=a[0]/2;
}

//System.out.println("After sorting array is ");
for(int i=0;i<half;i++)
{
	
	 
	//System.out.print (a[i]+" ");
}
*/
