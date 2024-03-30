package com.multithreading;

public class ThreadDemo extends Thread
{
	public static void main(String[] args)
	{
		ThreadDemo threaddemo=new ThreadDemo();
		threaddemo.start();//hear jvm calls the start method using start() of thread class
		
		for(int i=0;i<5;i++)
		{
			System.out.println(" Thread main calss 1");
		}
		
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		System.out.println("run method 2");
	}

}
