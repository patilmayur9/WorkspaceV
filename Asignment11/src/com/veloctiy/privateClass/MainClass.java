package com.veloctiy.privateClass;

public class MainClass 
{
	public static void main (String args [])
	{
		//ClassRestriction classrestriction=new ClassRestriction();
		Animal a=new Animal();
		Dog d=new Dog();
		System.out.println(d instanceof Animal);
		System.out.println(a instanceof Object);
		System.out.println(a instanceof Dog);
		}
}
class Animal
{
	
}
class Dog extends Animal
{
	
}