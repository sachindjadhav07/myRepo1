package practice;

public class Constructor_Overloading 
{
	int a;
	int b;
	int c;
	
	
	public Constructor_Overloading()
	{
		 a=10;
		 b=20;
		 c=30;
		System.out.println("This is constructor");
	}

	public static void main(String[] args) 
	{
		Constructor_Overloading ob1= new Constructor_Overloading();
		ob1.test();

	}
	
	
	public void test()
	{
		int sum = a+b+c;
		System.out.println("Value of sum is "+sum);
	}

}
