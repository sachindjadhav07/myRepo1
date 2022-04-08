package this_and_super_keyword;

public class this_keyword 
{
	
	int a=10;
	int b=20;
	int c=30;

	public static void main(String[] args) {
		
		this_keyword ob1= new this_keyword();
		ob1.addition();
		ob1.addition1();
		

	}
	
	public void addition()
	{
		int a=50;
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
	}
	
	public void addition1()
	{
		int a=50;
		int sum=this.a+b+c;
		System.out.println("Addition is "+sum);
	}

}
