package com.collection.comparable;

import java.util.Comparator;

public class Employe implements Comparator<Employ> {

	@Override
	public int compare(Employ obj1, Employ obj2) {
//		 if(obj1.sallary>obj2.sallary) return 1;
//		 else if (obj1.sallary==obj2.sallary) return 0;
//		 else return -1;
//		/*
//		 * output 
//		 * 2 suraj 15000
//		 *  1 mayur 23000 
//		 *  3 chintu 33000
//		 */
		
		return obj1.name.compareTo(obj2.name);
		
	 
		
	}

}
