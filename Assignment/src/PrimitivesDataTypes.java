//assignment 2 7/2/2022
// Write a java program in which declare the different primitives data tyes.
public class PrimitivesDataTypes
{
	byte b;  // only class level,instance,global variables value initialized by zero 
	short s;
	int i;
	long l;
	
	public static void main (String args [])
	{
		//method level all variables are not initialized by the compiler so we can initialize them like int i=10; etc 
		
		//numeric primitive data types declaration
		byte b;
		short s;
		int i;
		long l;
		
		//floating point primitive data types declaration
		float f;
		double d;
		
		//boolean(true/false) primitive data types declaration
		boolean bo;
		
		//character primitive data types declaration
		char c;
		
		PrimitivesDataTypes p=new PrimitivesDataTypes();
		System.out.println("value of instance variable b=" + p.b + " s=" + p.s +" i=" + p.i +" l="+p.l );
	}
	

}
