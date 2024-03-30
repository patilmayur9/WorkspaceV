package com.interview;

public class IntegerArraySorting 
{
	public static void main(String[] args) 
	{
		int [] a= {10,50,47,7,35,57,23,45};
		//System.out.println(a);
		
		System.out.println("before  ");
		for(int m=0;m<a.length;m++)
		  {
			  System.out.print(a[m]+" ");
		  }	
		
		for (int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				/*if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
//					before  
//					10 50 47 7 35 57 23 45 
//					After  
//					57 50 47 45 35 23 10 7
				}*/
				
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;					
				}	
//				before  
//				10 50 47 7 35 57 23 45 
//				After  
//				7 10 23 35 45 47 50 57 
				 
				
				
			}
		}
		System.out.println();
		System.out.println("After  ");
		for(int m=0;m<a.length;m++)
		  {
			  System.out.print(a[m]+" ");
		  }
		 
		
	}

}
