package this_and_super_keyword;

public class this_and_super_keyword extends this_keyword 
{
	int b=1000;

	public static void main(String[] args) 
	{
		
		this_and_super_keyword ob2= new this_and_super_keyword();
		ob2.addition();
		ob2.addition1();
		ob2.addition2();
		

	}
	
	public void addition2()
	{
		int a=500;
		int b=200;
		int sum=a+this.b+super.c;
		System.out.println("Addition is "+sum);
	}

}
