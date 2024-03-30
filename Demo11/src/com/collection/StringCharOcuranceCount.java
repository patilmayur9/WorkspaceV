/*.*/
package com.collection;

import java.util.Arrays;
import java.util.HashMap;

public class StringCharOcuranceCount 
{
	public static void main(String[] args) 
	{
		String str="Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java";
		str.replaceAll("[0-9]", "");		 
		str.replaceAll("\\s", "");
		
		String arr[] =new String[str.length()];
		for(int i=0; i<str.length();i++)
		{ 
			//char c=str.charAt(i);
//			if((>=65 && c<=90) || (c>=97 && c<=122))
//			{
				arr[i]= String.valueOf(str.charAt(i));
				
//			}
		}
	
//		for(String h:arr) {
//			System.out.print(h);
//		}
		
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		//int count;
		/*for(int i=0;i<arr.length;i++)
		{
			count=0;
			for (int j=0;j<arr.length;j++)
			{
				if( arr[i].equals(arr[j]) );
				{
					count++;
					 
				}
			}
			
			hs.put( arr[i], count);
			
		}*/
		 for(int j = 0; j<arr.length; j++) {
			 int cnt = 0;
			 for(int k = 0; k<arr.length; k++) {
				 if(arr[j].equals(arr[k]) ) {
//					 System.out.println(arr[j]);
					 cnt++;
				 }
			 }
			 hs.put(arr[j], cnt);
		 }
		System.out.println(hs);
	}

}
