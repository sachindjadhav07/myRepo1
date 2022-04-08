package constructor;

public class CS4 {
	
	int a; //1.variable declaration
	int b; //1.variable declaration
	int c; //1.variable declaration
	
	public CS4() //zero parameter constructor
	{
		a=100;
		b=200;
	    c=300;
		System.out.println("Running zero parameter constructor");
	}
	
	public CS4(int num1) //constructor with one parameter
	{
		a=num1;
		
		System.out.println("Value of a is "+a);
		System.out.println("Running constructor with one parameter");
	}
		
		public CS4(int num1, int num2) //constructor with two parameters
		{
			a=num1;
			b=num2;
			System.out.println("Running constructor with two parameters");		
		}
		
		
		public CS4(int num1, int num2, int num3) //constructor with three parameters
		{
			a=num1;
			b=num2;
			c=num3;
			System.out.println("Running constructor with three parameters");
			
		}
	

	public static void main(String[] args) 
	{
		
		CS4 cs40= new CS4(); //created object
		cs40.addition();
		
		
		CS4 cs41= new CS4(800); //created object
		cs41.addition();
		
		CS4 cs42= new CS4(30, 60); //created object
		cs42.addition();
		
		CS4 cs43= new CS4(10, 90, 100); //created object
		cs43.addition();
		

	}
	
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
	}

}
