/*3. Design the method for ArrayList<Employee> which returns 
 * the list of employee and print that data.*/
package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ReturnArrayList
{	static int id;
static String name;
static String city;

	public ArrayList<Employee> getEmployeeList()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many employee you will be adding in list  ");
		int range=sc.nextInt();
		
		ArrayList<Employee> list=new ArrayList<Employee>();
		for(int i=0;i<range;i++)
		{
			 
			System.out.println("Enter the Employee id ");
			id = sc.nextInt();
			
			//hear we take new scanner object becouse of ambiguity problem to variables city and name hav same type 
			//String and its methods are sc.nextLine() and sc.next() 
			//compiler get confused which variable get setteled he select last ocurance like city not a middile one name
			Scanner sc3 = new Scanner(System.in); 
			System.out.println("Enter the Employee name ");
			name = sc3.nextLine();

			System.out.println("Enter the Employee city ");
			city = sc.next();

			list.add(new Employee(id, name, city));
			 
		}
		
		
		return list;
		
	}
	
	public static void main(String[] args)
	{
		ReturnArrayList returnarraylist=new ReturnArrayList();
		ArrayList<Employee> list=returnarraylist.getEmployeeList();
		Iterator<Employee> al=list.iterator();
		while(al.hasNext())
		{
		System.out.println(al.next());
		}
		
		/*Employee emp =new Employee();
		ArrayList<Employee> list=emp.getEmployeeDetails();
		
		for(Employee emp1:list)
		{
			System.out.println(emp1);
		}*/
	}
	 
}
