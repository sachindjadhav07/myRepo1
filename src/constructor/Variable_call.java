package constructor;

public class Variable_call 
{
	int a=10; //1,2 --> Non- static variable
	static int b=20; // --> static variable
	String name="Velocity";
	

	public static void main(String[] args) 
	{
		Variable_call v=new Variable_call(); // creating object
		
		System.out.println("Value of variable a is "+v.a); // calling Non-static variable
		System.out.println("Value of variable b is "+b); //calling static variable
		System.out.println("Value of name is "+v.name);
		

	}

}
