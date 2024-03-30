package com.interview;

public class PrimeNumberNewLogic {
	public static void main(String[] args) {

		/*int n = 10;
		int count = 0;

		for (int j = 1; j <= n; j++) {
			if (n % j == 0) {
				count++;
			}

		}
		System.out.println(count);
		if (count == 2) {
			System.out.println("number is prime " + n);
		} else {
			System.out.println("number is non prime " + n);
		}*/
		
		
		//new logic for finding prime numbers in given range
		int range=5;
		System.out.println("Range is = "+range+" and prime Numbers are ");
		System.out.print("1  2  3  ");
		int count=0,prime=0;
		if(range>3)
		{
			for(int i=4;i<=range;i++)
			{
				if(i%2==0)
				{count++;
					//System.out.println();
				}
				else if(i%3==0)
				{
					count++;
				}
				else 
				{prime++;
					System.out.print(i+"  ");
				}
			}
			
		}
		 
	}

}
