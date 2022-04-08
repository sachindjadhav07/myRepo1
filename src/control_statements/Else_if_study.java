package control_statements;

public class Else_if_study {

	public static void main(String[] args) 
	{
		
//		if my marks are
//		
//		
//		40-60--> 2nd class
//		>=60- <70--> 1st class
//		>=75 --> Dist
		
		int marks=40;
		
		if (marks>=40 & marks<60)
		{
			System.out.println("I am in 2nd class");
		}
		
		else if (marks>=60 & marks<75)
		{
		    System.out.println("I am in 1st class");	
		}
		
		else if (marks>=75)
		{
			System.out.println("I am in Distinction");
		}
		
		else
		{
			System.out.println("I am failed");
		}

	}

}






