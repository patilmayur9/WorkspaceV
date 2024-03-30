package com.interview;

public class IntergerArraySortingDescending 
{
	public static void main(String[] args) 
	{
		int a[]= {10,30,60,70,7,1,70};
		System.out.println("before : ");
		for(int m=0;m<a.length;m++)
		  {
			  System.out.print(a[m]+" ");
		  }	
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
//					    before : 
//						10 30 60 70 7 1 70 
//						After : 
//						1 7 10 30 60 70 70
				}	
				
				/*if(a[i]>a[j])//for(int j=i+1;j<a.length;j++)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
//						before : 
//						10 30 60 70 7 1 70 
//						After : 
//						70 70 60 30 10 7 1 
				}*/
			}
		}
		System.out.println();
		System.out.println("After : ");
		for(int m=0;m<a.length;m++)
		  {
			  System.out.print(a[m]+" ");
		  }	
		
		
	}

}
