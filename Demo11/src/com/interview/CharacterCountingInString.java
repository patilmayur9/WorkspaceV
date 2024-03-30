package com.interview;

import java.util.HashMap;
import java.util.HashSet;

public class CharacterCountingInString 
{
	public static void main(String[] args) 
	{
		String str=	"Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995. James Gosling is known as the father of Java. Before Java, its name was Oak. Since Oak was already a registered company, so James Gosling and his team changed the name from Oak to Java";	
		System.out.println(str);
		String str1=str.replaceAll("\\s", "");//.replaceAll(" ","")//both replaces the space with nothing
		str1=str1.replaceAll("[0-9]", "");//removes all 0 to 9 numbers
		System.out.println(str1);
		int count;
		HashMap<String, Integer> hm=new HashMap<>();
		for(int i=0;i<str1.length();i++)
		{count=0;
			for(int j=0;j<str1.length();j++)
			{
				if(str1.charAt(i) == str1.charAt(j))
				{
					count++;
					
				}			
			}
			//System.out.print(count+" ");
			String s=String.valueOf(str1.charAt(i));
		hm.put(s, count);	
	    System.out.print(count+" ");
		}
		System.out.println();
		System.out.println(hm);
		
		
		
		/*HashSet hs=new HashSet<>();
		hs.add(1);
		hs.add("mayur");*/
		
	}
}
