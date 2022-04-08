package control_statements;

public class Mathematical_Operations
{
	int a=10;
	int b=20;
	int c=30;

	public static void main(String[] args) 
	{
		Mathematical_Operations ob1 = new Mathematical_Operations();
		
		int SrNo=4;
		
		switch (SrNo) 
		{
		case 1: ob1.Addition();
		break;
			
		case 2: ob1.Substraction();
		break;
		
		case 3: ob1.Multiplication();
		break;
		
		case 4: ob1.Division();
		break;

		default:
			System.out.println("Invalid SrNO");
			break;
		}
		

	}
	
	public void Addition()
	{
		int sum=a+b+c;
		System.out.println("Addition is "+sum);
	}
	
	public void Substraction()
	{
		int sub=c-b;
		System.out.println("Substraction is "+sub);
	}
	
	public void Multiplication()
	{
		int mult=a*b*c;
		System.out.println("Multiplication is "+mult);
	}
	
	public void Division()
	{
		int div=c/a;
		System.out.println("Division is "+div);
	}

}
