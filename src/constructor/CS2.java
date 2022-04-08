package constructor;


public class CS2
{
	
	int a;
	
	public CS2() // this is user defined zero parameter constructor
	{
		a=10;
		System.out.println("Running zero parameter constructor");
	}
	


	public static void main(String[] args) 
	{
		CS2 c2=new CS2(); //creating object of a class
		c2.test1(); //calling Non-Static method
		

	}
	
	public void test1() //this is non-static method
	{
		System.out.println("Non Static method test1 is called");
	}

}
