package com.main.binaryserch;
 
import java.util.Arrays; 
import java.util.List;
import java.util.stream.Collectors;

public class BinaraySerchFindElementInArray {
	
	public static void main(String args[]) {
		int [] arr = new int[] {10,45,67,23,88,3,4,67,56,55};
		Arrays.sort(arr); 
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());//Boxed convertst the int to Integer as a object 
	 int i=-1;
		System.out.println(list);
		 for(int a: arr) {
			 System.out.println(++i+"a-> "+a);
		 }
		 
		 int a = findIndex(arr, arr.length, 56);
		 System.out.println("the element "+56+" is at this position "+a);
		
	}
	
	
	public static int findIndex(int[] a,int size,int target) {
		int start = 0;//start is array starting point so 0 is first index of every array
		int end = size -1;// array sotres the data from 0th index so
		int mid = (start + end)/2;
		
		while(start <= end) {
			if(a[mid] == target) {
				return mid;
			}
			//got  to right side
			if(target > a[mid] ) {
				start =  mid+1;
			} else {// got to left
				end = mid-1;
			}
			//start and end is updated so we need to calculate new mid
			mid = (start + end)/2;
		}
		return -1;
		
	}

}
