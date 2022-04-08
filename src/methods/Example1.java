package methods;

public class Example1 
{

	public static void main(String[] args) {
		
		System.out.println("Running main method");
		
		test1(); //calling static regular method
		//syntax: methodname();--> to call static regular method in same class
		test1();
		test1();
		test2();
		
		System.out.println("Ending main method");

	}
	
	// public static void test1(); // method declaration // incomplete method // because this method don't have body
	
	public static void test1() // complete method // method definition 
	{
		// this is method body
		System.out.println("This is static regular test1 method");
	}
    
	public static void test2()
	{
		System.out.println("This is static regular test2 method");
	}
	
	public static void test3()
	{
	
	}
}
