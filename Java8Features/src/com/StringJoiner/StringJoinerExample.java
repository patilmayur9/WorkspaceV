package com.StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample 
{
	public static void main(String[] args) { 
		
		//String joiner
		StringJoiner sj=new StringJoiner("-");
		sj.add("mayur");
		sj.add("maruti");
		sj.add("patil");
		System.out.println(sj);
		
		
		StringJoiner sj1=new StringJoiner(":");
		sj1.add("mayur");
		sj1.add("maruti");
		sj1.add("patil");
		System.out.println(sj1);
		
	}

}
