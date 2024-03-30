
 public class InstanceVariableAccess 
{
	//declaration of instance variable
	int a=10;
	int b=20;
	
	
	//static area
	public static void main(String args[])
	{
		//main method is always static
		InstanceVariableAccess iva=new InstanceVariableAccess();//creating the class object
		
		System.out.println("The instace variable a : "+iva.a); //calling instance variable in static method or main method
		System.out.println("The instace variable a : "+iva.b);//
		
		iva.m1();//calling instance method m1
	}
	
	//crating instance method 
	  void m1()
	{
		//instance method area
		System.out.println("Insatance variables a and b are"+a+b);
	}

}

 