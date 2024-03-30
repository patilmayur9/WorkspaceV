package com.Anonymous.classes;

public class AnonymousClass {
	public static void main(String[] args) {
//		
//		Message m = new Message() {
//			public void morn() {
//				System.out.println("good morning");
//			}
//		};
//		m.morn();
//		
//		Message t = () -> System.out.println("good morning mayur");
//		t.morn();
		
		//anonymous inner class to implement the function interface and provide its implementation
		Message t = (a,b) -> {
			System.out.print(b);
			System.out.print(a);
		};
		t.morn("mayur",9);
		
		
	}

}
