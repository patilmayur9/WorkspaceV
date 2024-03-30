package com.interview;

import java.util.ArrayList;
import java.util.HashMap;

public class StringCharacterCnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) "
				+ "in the year 1995. James Gosling is known as the father of Java. Before Java, its "
				+ "name was Oak. Since Oak was already a registered company, so James Gosling and his "
				+ "team changed the name from Oak to Java";
		 //str=str.replaceAll("\\s", "");//remove the all spaces in given string
		 HashMap<String, Integer>  hs = new HashMap<String, Integer>();//declaration of hashmap
		 String arr[] = new String[str.length()];
		 
		 
		 
		 for(int i = 0;i<str.length();i++) 
		 {
//			 if( (str.charAt(i)>=65 || str.charAt(i)<=90) && (str.charAt(i)>=97 || str.charAt(i)<=122) ) 
//				{
						arr[i] = String.valueOf(str.charAt(i));//hear converting char to string and primitive to non primitive
//				}
			 
		 }
//		 for(int l=0;l<arr.length;l++) 
//		 {
//		//	 System.out.print(arr[l] + " ");
//		 }
		 
		 for(int j = 0; j<arr.length; j++) {
			 int cnt = 0;//Integer cnt=0;
			 for(int k = 0; k<arr.length; k++) {
				 if(arr[j].equals(arr[k]) ) {
//					 System.out.println(arr[j]);
					 cnt++;
				 }
			 }
			 hs.put(arr[j], cnt);
		 }
		 System.out.println(hs);
		 //System.out.println("count is : " + hs);

	}
	 

}
