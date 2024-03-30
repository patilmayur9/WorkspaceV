package com.hibernate;

public class Student {
	private int id;
	private String firstName;
	private String lastName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
/*
Note-Hibernate mapping file is used by hibernate framework 
to get the information about the mapping of a POJO class and 
a database table.
4. student.hbm.xml

Note- if we don’t specify column tag then it will take property 
name as table column name into database. If we specify column 
tag then it will take that as column name into database.
Element of mapping file1. hibernate-mapping: It is the root element.
2. Class: It defines the mapping of a POJO class to a database 
table.
3. Id: It defines the unique key attribute or primary key of the 
table.
4. generator: It is the sub element of the id element. It is used to 
automatically generate the id.
5. property: It is used to define the mapping of a POJO class 
property to database table column
5. hibernate.cfg.xml

6. Test.java

OutputRecord is inserted*/