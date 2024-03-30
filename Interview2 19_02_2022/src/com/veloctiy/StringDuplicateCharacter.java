package com.veloctiy;

public class StringDuplicateCharacter {

	public static void main(String[] args) {

		String str = "Java is a platform independent language";

		str = str.replaceAll(" ", "");
		System.out.println("Duplicates character in givern String are : ");
		int count;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = i + 1; j < str.length(); j++) {

				if (str.charAt(i) == str.charAt(j)) {
					count++;
				}
			}

			if (count == 1) {
				System.out.print(str.charAt(i) + " ");
			}

		}

	}
}
 
