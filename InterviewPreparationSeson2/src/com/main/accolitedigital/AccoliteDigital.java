package com.main.accolitedigital;
/*
 * accolite digital india private limited

MaxDiffBetween2NonZeroIndices
int[] input = new int[] {1, 0, 0, 0, 0, 0, 1};
Chanchal Gopaldas Detwani3:23 PM
int x = 7;
Max Diff : 6 false
Max < x
"NO" OR ELSE "YES"
int[] input = new int[] {1, 0, 1, 0, 1, 0, 0, 1};
Chanchal Gopaldas Detwani3:24 PM
x = 3
1, 0, 1 => 2
1, 0, 0, 1 => 3
YES
 */
public class AccoliteDigital {
	public static void main(String[] args) {
		System.out.println(findMaxDiffBetween2NonZeroIndices(new int[] {1, 0, 0, 0, 0, 0, 1},1));
	}
	
	public static String findMaxDiffBetween2NonZeroIndices(int[] arr, int target) {
		int count = 0;
		for(int i=0;i< arr.length;i++) {
			if(arr[i] == 1) {
				count = 0;
			} else {
				count ++;
				if(target -1 <= count) {
					return "yes";
				}
			}
		}
		return "no";
		
	}

}
