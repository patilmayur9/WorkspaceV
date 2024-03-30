package com.main.turningpoint2ndround;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
Below data present in one file read the data and print like given output

Ramesh-India-Chennai
Pradeep-USA-Newyork
Ramesh-India-Kerala
Pradeep-USA-Washington
Ramesh-India-Hyderabad

OUTPUT
Ramesh: Chennai,Kerala,Hyderabad

Pradeep: Newyork, Washington

 

India: Chennai, Kerala, Hyderabad

USA: Newyork, Washington
 */
public class FileReadOperation {

    public static void main(String[] args) {
    	
    	 try {
             String filePath = "C:\\Users\\Admin\\Desktop\\Doc\\New folder\\Name_address_country.txt";
             Map<String, StringBuilder> nameMap = new HashMap<>();
             Map<String, StringBuilder> countryMap = new HashMap<>();

             try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {//try with resources
                 String line;
                 while ((line = reader.readLine()) != null) {// here variable  String 'line' assigned the string and null checking is in one line
                     String[] parts = line.split("-");
                     String name = parts[0];
                     String city = parts[2];
                     String country = parts[1];

                     nameMap. computeIfAbsent(name, k -> new StringBuilder()).append(city).append(",");
//                     System.out.println("nameMap-> "+nameMap);
                     countryMap.computeIfAbsent(country, k -> new StringBuilder()).append(city).append(",");
//                     System.out.println("countryMap-> "+countryMap);
                 }
             }

             printOutput("Names", nameMap);
             printOutput("Countries", countryMap);

         } catch (IOException e) {
             e.printStackTrace();
         }

    } 
    
    private static void printOutput(String label, Map<String, StringBuilder> dataMap) {
        System.out.println(label + ":");
        dataMap.forEach((key, value) -> System.out.println(key + ": " + value.deleteCharAt(value.length() - 1)));//deleting the last character that is extra comma  ','
        System.out.println();
    } 
} 