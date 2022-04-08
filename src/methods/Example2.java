package methods;

public class Example2 {

	public static void main(String[] args) 
	{
		test1(); // syntax--> methodname(); //calling static method from same class
		
		Example1.test1(); // syntax--> classname.methodname(); //calling static method from another class
        
		Example3.test3();
	}
	
	public static void test1()
	{
		System.out.println("Running static method from Example2");
	}

}
