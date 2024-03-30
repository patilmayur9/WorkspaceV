package com.main;

import java.io.Serializable;

public class SingletonClass implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5388648200584067065L;
	
	public static SingletonClass singletonClass;
	
	private SingletonClass() {// using private Constructor we can not create object of that class
		
	}
	
	public static SingletonClass getSingletonClassObject() {
		synchronized (SingletonClass.class) {// this is an  method level lock only one thread can access at a time
			if(singletonClass == null) {
				singletonClass = new SingletonClass();
			}
			return SingletonClass.singletonClass;
		}
	}
	
	protected Object clone() {
		return singletonClass;
	}
	
	protected Object readResolve() {
		return singletonClass;
	}

	 

}
