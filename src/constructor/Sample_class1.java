package constructor;

public class Sample_class1 
{
	int a=10;
	static int b=20;
	
	public static void main(String[] args) 
	{
		Sample_class1 obj = new Sample_class1();
		obj.test();
	}

	public void test()
	{
		
	int c=30;
	int d=40;
	int sub=d-b;
	System.out.println("substraction is "+sub);
	}
}
