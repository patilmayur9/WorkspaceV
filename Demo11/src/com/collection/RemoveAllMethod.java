package com.collection;

import java.util.ArrayList;

public class RemoveAllMethod
{
	public static void main(String[] args) 
	{
		  
		ArrayList al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);		
		System.out.println(al);//[1, 2, 3, 4, 5, 6]
		System.out.println(al.isEmpty());//false
		al.addAll(al);
		System.out.println(al);//[1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6]
		al.removeAll(al);
		System.out.println(al);//[]
		System.out.println(al.isEmpty());//true
	
		
		ArrayList al1=new ArrayList();
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);		
		ArrayList al2=new ArrayList();
		al2.add(3);
		al2.add(4);
		al2.add(5);
		al2.add(6);
		System.out.println(al1);//[1, 2, 3, 4]
		System.out.println(al2);//[3, 4, 5, 6]
		
		al1.removeAll(al2);//jo bhi al1 mai al2 ke common object hai vahi sirf al1 mai se remove karo 
		System.out.println("..."+al1);//...[1, 2]
		System.out.println("---"+al2);//---[3, 4, 5, 6]
		
		al2.removeAll(al1);//jo bhi al2 mai al1 ke common object hai vahi sirf al2 mai se remove karo
		System.out.println( al1);//...[1, 2, 3, 4]
		System.out.println( al2);//---[5, 6]
		
		al1.addAll(al2);
		System.out.println(al1);//[1, 2, 3, 4, 3, 4, 5, 6]
		System.out.println(al2);//[3, 4, 5, 6]
		
		al1.removeAll(al2);//jo bhi al1 mai al2 ke object add huve hai o   sirf remove kar do al1 mai se 
		System.out.println(al1);//[1, 2]
		System.out.println(al2);//[3, 4, 5, 6]
		
		ArrayList al3=new ArrayList();
		al3.add(1);
		al3.add(2);
		al3.add(3);
		al3.add(4);		
		ArrayList al4=new ArrayList();
		al4.add(5);
		al4.add(6);
		al4.add(7);
		al4.add(8);
		
		System.out.println(al3);//[1, 2, 3, 4]
		System.out.println(al4);//[5, 6, 7, 8]
		
		al3.removeAll(al4);//al3 mai jo bhi al4 ke commom concept hai o sirf al3 mai se nikal do 
		
		System.out.println(al3);// [1, 2, 3, 4]
		System.out.println(al4);// [5, 6, 7, 8]
		 
		al4.addAll(al3);//al4 mai al3 ke pure object add kar lo
		System.out.println(al4);//[5, 6, 7, 8, 1, 2, 3, 4]
		System.out.println(al3);//[1, 2, 3, 4]
		
		al4.removeAll(al3);//al4 mai jo al3 ke object add kiye huve hai o sub nikal do al4 mai se 
		System.out.println(al4);// [5, 6, 7, 8]
 		System.out.println(al3);//[1, 2, 3, 4]
 		
 		ArrayList al5=new ArrayList();
		al5.add(1);
		al5.add(2);
		al5.add(3);
		al5.add(4);	
		al5.add(5);
		ArrayList al6=new ArrayList();
		al6.add(5);
		al6.add(6);
		al6.add(7);
		al6.add(8);
		
		al5.addAll(al6);
		System.out.println(al5);//[1, 2, 3, 4, 5, 5, 6, 7, 8]
		System.out.println(al6);//[5, 6, 7, 8]
	 
		al5.removeAll(al6);
		System.out.println(al5);//[1, 2, 3, 4]
		System.out.println(al6);//[5, 6, 7, 8]
		
				
	}

}
