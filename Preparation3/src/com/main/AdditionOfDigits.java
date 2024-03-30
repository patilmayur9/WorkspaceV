package com.main;

import java.util.Scanner;

public class AdditionOfDigits {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter any number ");
		int a = sc.nextInt(); //10
		int temp = 0;
		while(a>0) {
			
			temp = temp + a % 10; // baki 
			a = a / 10; //
			
		}
		System.out.println(1%10);//0.123  in this situation it takes after decimal point first digit that is 1
		System.out.println(1/10);// 0.1  in this situation it takes before decimal digit that is 0
		System.out.println(temp);
	}

}
