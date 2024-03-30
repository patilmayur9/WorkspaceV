package com.interview;

import java.util.HashMap;

public class CountNumberofWord
{
	public static void main(String[] args) 
	{
		String str="Normally, strings like \"John Doe\", cannot have234met657hods or properties because they are 788not objects. But with JavaScript, methods and properties are also available to strings, because JavaScript treats strings as objects when executing methods and properties.";
	// System.out.println(str);
		str=str.replaceAll("[^a-zA-Z\" \"]", "");//it removes the all other except alphabates upper and lowercase
		//System.out.println(str);
		str=str.replaceAll( "\"", "");
		System.out.println(str);  
		HashMap<String,Long> hm=new HashMap<String,Long>();
		String ch[]=str.split(" ");
		int  num=0;
		Long count;
		for(int i=0;i<ch.length;i++)
		{ count=0l; ;
			for(int j=i+1;j<ch.length;j++)
			{
				//System.out.println("mayur");
				if(ch[i].equals(ch[j]))  // if(ch[i].equals(ch[j])) 
				{
					//System.out.print( ch[i]+" ");
					count++;
					 
					//System.out.println();
				}
			}
	 System.out.println(ch[i]+"    "+count);
			hm.put(ch[i],count);
			 
			if(count==1)
			{
				 
				num++;
				//System.out.println(ch[i]);
			}
		}
		System.out.println(num);
		 
		 System.out.println(hm);
		 
 	}

}
