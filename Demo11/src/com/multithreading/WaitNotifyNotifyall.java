package com.multithreading;

public class WaitNotifyNotifyall 
{
	public static void main(String[] args) 
	{
		WaitNotifyNotifyall_1 thread=new WaitNotifyNotifyall_1();
		thread.start();
		
		synchronized (thread)
		{ 
				System.out.println("This is main class thread main Thread with synchronizeed ");
				try {
					thread.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 
			
		}
		
		System.out.println("end of execution of main class ");
		
	}

	
}
