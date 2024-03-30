package com.mornigMock;


public class StringArrayIntegerTwoElementAddition 
{
	public static void main(String[] args) {
		String str[]= {"[1,2,3,15]","[10,2,3,4,5,6]"};
		String s1=null;
		String s2=null;
		for(int i=0;i<2;i++)
		{
			if(i==0)
			{
				s1=str[i].replaceAll("[^0-9]", "");//[^yananter je string madhe hava ahe te type kara]
				//String[] parts = s1.split(",");
				//System.out.println(parts[0]+" "+parts[1]+" "+parts[2]);
			}
			else
			{
				s2=str[i].replaceAll("[^0-9]", "");
			}
		}
		
//		int [] arrs1 = new int [s1.length()];
//		int [] arrs2=new int[s2.length()];
//	      for(int i=0; i<s1.length(); i++) {
//	         arrs1[i] = Integer.parseInt(str[i].replaceAll("[^0-9,]", ""));
//	      }
		System.out.println(s1);
		System.out.println(s2.charAt(1));
		System.out.println(s2);
	//s1.split(",");
		//int s1array[]=s1.split(,);
		
		
		
 
	}

}
