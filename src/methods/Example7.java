package methods;

public class Example7 
{

	public static void main(String[] args)
	{
		Example7 e= new Example7(); //object creation
		
		addition(); //calling static method 
		
		e.studentInfo(); //calling non-static method 
		
		e.studentInfo(); //calling method without parameter
		
		e.studentInfo1("Pune", 11, 'B', 73.31f); //calling method with parameter 
		
		e.studentInfo1("MH", 12, 'A', 999.99f);
		
		e.studentInfo1("Katraj", 8, 'C', 11.11f);
		
		addition1(100, 200, 11);
		addition1(400, 300, 11);
		addition1(500, 500, 10);
        addition1(10, 20, 30);
	}
	
	public static void addition() 
	{
		int a=10;
		int b=20;
		int sum=a+b;
		
		System.out.println("Addition is "+sum);
		
	}
	
	public static void addition1(int a, int b, int c)
	{
		int sum=a+b+c;
		
		System.out.println("Sum is "+sum);
	}
	
	public void studentInfo() //non-parameterized method
	{
		//name, weight, grade, roll_No
		//String name; // step1. variable declaration
		//name="Velocity"; // step2. variable initialization
		
		String name="Velocity"; //step1,step2
		int RollNum=10;
		char grade='A';
		float weight=73.31f;
		
		System.out.println("=================================");
		System.out.println("Student name is "+name);
		System.out.println("Student RollNum is "+RollNum);
		System.out.println("Student grade is "+grade);
		System.out.println("Student weight is "+weight);
		System.out.println("=================================");
		
	}
	
	public void studentInfo1(String name, int RollNum, char grade, float weight)
	{
		// Method with parameter
		
		System.out.println("=================================");
		System.out.println("Student name is "+name);
		System.out.println("Student RollNum is "+RollNum);
		System.out.println("Student grade is "+grade);
		System.out.println("Student weight is "+weight);
		System.out.println("=================================");
	}

}
