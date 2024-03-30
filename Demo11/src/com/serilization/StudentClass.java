package com.serilization;

import java.io.Serializable;

public class StudentClass implements Serializable 
{
	int rollno;
	String name;
	transient int password;
	static  String collegeName;
	String address;
	

}
