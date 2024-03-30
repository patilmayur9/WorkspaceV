package com.stringOperations;

public class StringOperation 
{
	public static void main(String[] args)
	{
		String s1 = new String("velocity"); // Two objects created. One in heap and one in SCP. S1 points to heap object
		String s2 = "velocity"; // No object created. s2 point to SCP velocity
		String s3 = new String("training"); //Two Objects created. One in heap and one in SCP. s3 point to Heap
		String s5 = new String("velocity"); // One Object created in Heap
		String s6 = "training"; // No object created. s6 point to SCP training

	}
}
