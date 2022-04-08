package control_statements;

public class Grade {

	public static void main(String[] args) 
	{
		
		char Grade='D';
		
		switch (Grade) 
		{
		case 'A': System.out.println("Your marks are >=75");
			
			break;
			
		case 'B': System.out.println("Your marks are >=60 to <75");
		
		break;
		
		case 'C': System.out.println("Your marks are >=50 to <60");
		
		break;
		
		case 'D': System.out.println("Your marks are >=40 to <50");
		
		break;

		default: System.out.println("Your Wrong Choice");
			break;
		}
		

	}

}
