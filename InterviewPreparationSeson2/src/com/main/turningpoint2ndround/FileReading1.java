package com.main.turningpoint2ndround;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReading1 {
	public static void main(String[] args) {
		
		 String filePath = "C:\\Users\\Admin\\Desktop\\Doc\\New folder\\Name_address_country.txt";
		 Map<String, StringBuilder> names = new HashMap<>();
		 Map<String, StringBuilder> countries = new HashMap<>();
		 try(BufferedReader reader = new BufferedReader( new FileReader(filePath))) {
			 String line;
			 while((line = reader.readLine()) != null) {
				 String arr[] = line.split("-");//Ramesh-India-Chennai
				 String name = arr[0];
				 String country = arr[1];
				 String city = arr[2];
				 
				 names.computeIfAbsent(name, k -> new StringBuilder()).append(city).append(",");
				 countries.computeIfAbsent(country, k -> new StringBuilder()).append(city).append(","); 
			 }
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 printMap("names",names);
		 printMap("countries",countries);
	}
	
	public static void printMap(String name, Map<String, StringBuilder> map) {
		System.out.println(name+":");
		 map.forEach((key,value) -> System.out.println(key+":"+ value.deleteCharAt(value.length()-1)));
	}

}
