package Access_Specifier;

public class Demo {
	
	int a=20; //Default global variable
	public int b=40; //Public global variable
	protected int c=30; //Protected global variable
	private int d=10; //Private global variable

	public static void main(String[] args) 
	{
		
		Demo ob1 = new Demo();
		ob1.test(); //Calling default method from same class
		ob1.test1(); //Calling public method from same class
		ob1.test2(); //Calling private method from same class
		ob1.test3(); //Calling protected method from same class
		
		System.out.println("Default variable is "+ob1.a);
		System.out.println("Public variable is "+ob1.b);
		System.out.println("Protected variable is "+ob1.c);
		System.out.println("Private variable is "+ob1.d);

	}
	
	void test()
	{
		System.out.println("This is default test method");
	}
	
	public void test1()
	{
		System.out.println("This is public test1 method");
	}
	
	private void test2()
	{
		System.out.println("This is private test2 method");
	}
	
	protected void test3()
	{
		System.out.println("This is protected test3 method");
	}

}
