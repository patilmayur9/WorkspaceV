package com.interview;

public class DuplicateNumberInArray 
{
	public static void main(String[] args) 
	{
		int count;
		int a[]= {1,2,3,6,8,10,3,4,5,20,10,3,2,1,34,15,20,10,20,8,8,9,9,9,9};
		for(int i=0;i<a.length;i++)
		{count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.print(a[i]+" ");//1 2 3 10 20 8 9//for(int j=i+1;j<a.length;j++)
				//System.out.print(a[i]+" ");//6 4 5 34 15 //for(int j=0;j<a.length;j++)
			}
		}
	}
	

}
