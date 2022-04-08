package methods;

public class Example5 {

	public static void main(String[] args) 
	{
		Example5 e5= new Example5(); //created object of a class
		e5.demo(); //calling non-static method from same class
		
		Example4 e4= new Example4(); //created object for another class
		e4.test1(); //calling non-static method from another class
		e4.test2();
		

	}
	
	public void demo()
	{
		System.out.println("Hi this is non-static demo method");
	}

}
