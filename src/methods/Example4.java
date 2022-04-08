package methods;

public class Example4 
{

	public static void main(String[] args) 
	
	{
		// to call non-static method--> need to create object
		// creating object
		
		Example4 e4= new Example4(); //syntax--> ClassName ObjectName= new ClassName();
		
		//to call non-static method from same cladss 
		//syntax--> ObjectName.methodName();
		
		e4.test1(); //calling non-static method using object in same class
		e4.test1();
		e4.test1();
		e4.test2();	

	}
	
	public void test1() //this is non-static method because it don't have static keyword
	{
		System.out.println("Hi this is non-static test1 method is running");
	}
	
	public void test2()
	{
		System.out.println("Hi this is non-static test2 method is running");
	}

}
