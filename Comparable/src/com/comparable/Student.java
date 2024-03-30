package com.comparable;

public class Student implements Comparable<Student> {
 private Integer id;
 private String name;
 
public Student(Integer id, String name) {
	super();
	this.id = id;
	this.name = name;
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
return -o.id.compareTo(id);
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + "]" + "\n";
}
 

}
