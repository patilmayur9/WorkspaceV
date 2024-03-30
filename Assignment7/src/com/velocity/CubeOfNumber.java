//Design method public int getNumberCube(int num), 
//return int value to that method and result should be into main method.
package com.velocity;
import java.util.Scanner;


public class CubeOfNumber 
{
	int z=10;
	public static void main(String args[])
	{
		Scanner xyz=new Scanner(System.in);//creating the object of Scanner class
		
		System.out.println("Enter any value : ");
		
		int i=xyz.nextInt();//in int i stored the user entered value through console
		
		CubeOfNumber cubeofnumber=new CubeOfNumber();//creating an class object
		
		int result=cubeofnumber.getNumberCube(i);//calling method using class object with passing parameter
		System.out.println("The cube of value is : "+result);
	
	}
	public int getNumberCube(int num)
	{
		if(num==0)
		{
			return 0;
		}
		else
		{
		return (num*num*num);
	    }
	}
}
