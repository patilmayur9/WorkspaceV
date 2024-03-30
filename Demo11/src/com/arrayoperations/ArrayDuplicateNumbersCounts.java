package com.arrayoperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class ArrayDuplicateNumbersCounts {
	//find the array duplicate number count
	//[1,2,3,4,1,2,4,3,5,6,7,8,6,9,1,6] output 1->3, 2->2, 3->2...
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the array size");
		
		int array[] = new int[sc.nextInt()];
		System.out.println("Enter array element : ");
		for(int i=0;i<array.length;i++) {
			array[i] = sc.nextInt();
		}
		
		//Actul logic 
		List<Integer> list = new ArrayList<Integer>();
		int count;
		Set<Integer> set = new HashSet<>();
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<array.length;i++) { //1,2,3,4,1,2,4,3,5,6,7,8,6,9,1,6
			if(set.add(array[i])) {
				Integer p = map.get(array[i]);
				if(p == null) {
					p=0;
				}
				map.put(array[i], p + 1 );
			} else {
				Integer p = map.get(array[i]);
				if(p == null) {
					p=0;
				}
				map.put(array[i], p + 1 );
			}
			
//			count = 0;
//			for(int j=i+1; j<array.length; j++) {
//				 
//				if(array[i] == array[j]) {
//					count++;
//					array[j] = -1;
//				}
//			}
//			System.out.println(array[i]+"->"+count+" ");
		}
		System.out.println(set);
		System.out.println(map);
	}

}
