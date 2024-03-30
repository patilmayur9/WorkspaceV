//abstract method is possible to declare any return type & argument
public class Test3 extends Test2
{
	Emp m3()
	{
		System.out.println("m3 method ");
		return new Emp();
				
	}
	public static void main(String [] args)
	{
		Test3 t=new Test3();
		int a=t.m1('a');
		System.out.println("m1() return value is : "+a);
		
		Emp e=t.m3();
		System.out.println("m3() return value is : "+e);
	}
	
};
