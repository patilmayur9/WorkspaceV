package hello;

/*
public class wellcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("wellcome");
		System.out.println(" to velocity classes");

	}
}
*/
//.................................................................
/* public class wellcome {
int rollNum =10;
public static void main(String[] args){
//System.out.println(rollNum);
//C.E:non-static variable i cannot be referenced 
//from a static context(invalid)
wellcome test=new wellcome();
System.out.println(test. rollNum);//10(valid)
test.methodOne();
}
public void methodOne(){
System.out.println(rollNum);//10(valid)
}
}
*/
//...................................................................
public class wellcome
{
	int i =100;
	public static void main(String[] args) throws Exception
	{
//		wellcome w=new wellcome();
//		int x=0;
//		//System.out.println(x); // CE : Local variable x may not have been initialized in local variable jvm doesn't add default values to variable
//		System.out.println(w.i);
//		System.out.println();
//		System.out.println("mayur patil ......");
		//System.out.println(10/0);
		/*try {
			System.out.println(10/0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println(e.getMessage());
			//System.out.println("in a catch block");
		}*/
		System.out.println("After catch block");
		
		String s="mayur";
		String s1="mayur";
		String s2="Ravisir";
		String s3=new String("Ravisir");
		
		 System.out.println(s==s1);//true
		 System.out.println(s==s2);//false
		 System.out.println(s2==s3);//false
		 
		 System.out.println(s2.equals(s3));//true      Ravisir equals(Ravisir) -ture ravisir and Ravisir are same object
		 System.out.println(s.equals(s2));//false     	mayur.equals(Ravisir) -false mayur and Ravisir are different objcet
		 System.out.println(s.equals(s3));//false		mayur equals(Ravisir)   false mayur and Ravisir both objects are different
		 System.out.println("&&&"+s.equals(s1));//true
		 System.out.println(s.toString());//mayur
		 System.out.println(s3.toString());//Ravisir
		 
		 
		 s=s3;		//hear we add s3 refranced object as  Ravisir  to the s refranced object mayur 
		 			//is noting but s and s3 both are pointin to the same onject Ravisir 
		 System.out.println(s.equals(s3));//ture
		 System.out.println(s==s3);//ture
		 System.out.println(s.toString());//Ravisir
		 System.out.println(s3.toString());//Ravisir
		 
		 
		
	}
}