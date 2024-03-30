package com.stringOperations;

public class StringPalindrome {
	 

	public static void main(String[] args) {
		String s="There is I DND nayan also i was Shocked";
		int length=s.length();
		String words[]=s.split(" ");
		for (String word:words)
		{
			if(CheckPalindrome(word))
				System.out.println(word+" is palindrome");			 
		}
	}
	
	public static boolean CheckPalindrome(String input)
	{
		int a =0;
		int i = 0;
		int b= input.length() - 1;
		 while(b>a)
		 {
			    
			if(input.charAt(a) !=  input.charAt(b))
			{
				 return false;
			}
			 
			a++;
			b--;
		 }
		 
			return true;
		}

}
