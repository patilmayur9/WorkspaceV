import javax.print.attribute.IntegerSyntax;

class Parent 
{
	void test() 
	{
		System.out.println("Parent class method.");
	}
}
class Child extends Parent1
	{
		void test()
		{
			super.test();
		}
	}
class Parent1 extends Parent
{
	void test() 
	{
		System.out.println("Parent1 class method.");
		
		super.test();
	}
}
public class TestMain
{
	public static void main(String[] args)
	{
		Child c= new Child();
		c.test();
	}
}


