package com.raviSirProgram;

//WAP for if (a=1,b=2,c=3,d=4...Z=26)

//input== str="abc" output= 1+2+3=6
import java.util.*;

public class StringNumber {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		int j=1;
		for(char i='a';i<='z';i++)
		{
			hm.put(i, j);
			j++;
		}
//		System.out.println(hm.get('b'));
		System.out.println(hm);
		
		System.out.println("Enter the String");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		Integer sum=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			sum=sum + (int)hm.get(ch[i]);			
		}
		
		System.out.println("Sum of Entered Characters : "+sum);
		
 	
	
	}

	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*HashMap hm = new HashMap();

	int j = 1;
	for (char i = 'a'; i <= 'z'; i++) {
		hm.put(i, j);
		j++;			
	}
	System.out.println(hm);

	System.out.println("Enter you String in lowercase");
	Scanner sc = new Scanner(System.in);
	String input = sc.next();

	int sum = 0;
	char ch[] = input.toCharArray();
	for (int i = 0; i < ch.length; i++) {

		int n = (int) hm.get(ch[i]);
		sum = sum + n;

	}
	System.out.println("Sum of two String charactor number" + sum);
}*/