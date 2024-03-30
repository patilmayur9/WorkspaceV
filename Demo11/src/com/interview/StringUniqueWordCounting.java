 package com.interview;

public class StringUniqueWordCounting 
{
	public static void main(String[] args)
	{
		String str = "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) "
				+ "in the year 1995. James Gosling is known as the father of Java. Before Java, its "
				+ "name was Oak. Since Oak was already a registered company, so James Gosling and his"
				+ " team changed the name from Oak to Java";
		System.out.println(str);
		String str1=str.replaceAll("[0-9]", "");
		
		System.out.println(str1);
		
		String demo[]=new String[str.length()]; 
		for(int i=0;i<str1.length();i++)
		{
			 if( ((str1.charAt(i)>=65) | (str1.charAt(i)<=90)) & (str1.charAt(i)>=97 | str1.charAt(i)<=122) )
			 {
				 demo[i]=String.valueOf(str1.charAt(i)); 
			 }
			 else
				 demo[i]=" ";
			
		}
		for(String ss:demo)
		{
			System.out.print(ss);
		}
	}

}
