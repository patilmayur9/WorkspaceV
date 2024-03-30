package com.multithreading;

public class YeildThreadDemoMainClass 
{
	public static void main(String[] args) 
	{
		YeildThreadDemo yeildthreaddemo=new YeildThreadDemo();
		// YeildThreadDemo yeildthreaddemo1=new YeildThreadDemo();
		YeildThreadDemo1 yeildthreaddemo1=new YeildThreadDemo1();
		
		yeildthreaddemo.setPriority(1);
		yeildthreaddemo1.setPriority(10);
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		
		yeildthreaddemo.start();
		yeildthreaddemo1.start();
		
		for(int i=0; i<5;i++)
		{
			System.out.println("This is main calsss   "+Thread.currentThread().getName());
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		 

	/*	System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println();
		System.out.println("mayur"+Thread.currentThread()+"....");
		System.out.println();
		System.out.println("/////"+Thread.currentThread().getClass().getName());
		System.out.println();
		System.out.println(",,,,,"+Thread.currentThread().getPriority());*/
		
	}

}
