package com.arrayoperations;

import java.util.Arrays;
import java.util.List;

public class StaticArrayUpdatingOperation {
	public static void main(String[] args) {
		int a[] =  new int [] {10, 20, 30, 40, 50};
		List suit = Arrays.asList(  
				  "Japan",   
				  "India",   
				  "Austria",   
				  "Dubai"    
				);  
		int result[] = show(a);
		System.out.println("1st result array-> ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + "\t");
		}
		System.out.println();
		result[2] = 400;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t--");
		}
		System.out.println();
		result[1] = 200;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t--");
		}
		System.out.println();
		System.out.println("2st result array-> ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + "\t");
		}
		System.out.println();
		result = show(a);
		System.out.println("3st result array-> ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i] + "\t");
		}
		System.out.println();
		System.out.println("Disply array");
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println();
	}
	
	public static int [] show (int x[]) {
		for(int i=0;i<x.length;i++) { 
			x[i] = x[i] + 10;
		}
		System.out.println("printing array x before return -> ");
		for(int i=0;i<x.length;i++) {
			System.out.print(x[i] + "\t");
		}
		System.out.println();
		return x;
	}

}
