package constructor;

public class Test1 {

	public static void main(String[] args) 
	{
		Variable_call vc=new Variable_call(); //created object of another class
		
		System.out.println("Value of a is "+vc.a); //calling Non- static variable from another class
		
		System.out.println("Value of b is "+Variable_call.b); // calling static variable from another class
		

	}

}
