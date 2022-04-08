package Access_Specifier;

public class CallDemo 
{

	public static void main(String[] args)
	{
		Demo ob1 = new Demo();
		
		ob1.test(); //Calling default method from another class
		ob1.test1(); //Calling public method from another class
		//ob1.test2(); //Cannot call private method of another class
		ob1.test3(); //Calling protected method from another class
		
		
		System.out.println("Default variable from another class is "+ob1.a);
		System.out.println("Public variable from another class is "+ob1.b);
		System.out.println("Protected variable call from another class is "+ob1.c);
		//System.out.println("We cannot call private variable from another class "+ob1.d);
	}

}
