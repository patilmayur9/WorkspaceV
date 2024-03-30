package com.arrayoperations;

public class JaggedArray 
{
	public static void main(String[] args)
	{
		//int []c=new int [] {2,3,4,5,6,7};//we can declare also like that for creating refrance and initilization at the same time
		int jagged[][]=new int [3][];//hear only declare how many row are present in jagged array
		
		System.out.println("int jagged[][]=new int [3][]    ---->"+jagged.length);
		
		
		jagged[0]= new int[3];//0th row 3 column  array are created
		jagged[1]=new int [4];//1st row 4 array column array are created
		jagged[2]=new int[5];//2nd row 5 array column array are created		
		
		System.out.println("jagged[0]= new int[3]   ---->"+jagged[0].length);
		System.out.println("jagged[1]= new int[4]   ---->"+jagged[1].length);
		System.out.println("jagged[2]= new int[5]   ---->"+jagged[2].length);
		
		System.out.println("Array proxy name is : " +jagged.getClass().getName());
		
		int count=0;
		for(int i=0;    i<jagged.length  ;i++)
		{
			for(int j=0;  j<jagged[i].length  ;j++)
			{
				jagged[i][j]=count++;//inserting elements in the array using generating number 0,1,2,3,4,5,6.....
			}
		}
		
		System.out.println("printing the jagged array element : ");
		
		for(int i=0;    i<jagged.length  ;i++)
		{
			for(int j=0;  j<jagged[i].length  ;j++)
			{
				 System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
	}

}
