package control_statements;

public class Else_if_study2 {

	public static void main(String[] args) 
	{
		Else_if_study2 ob1=new Else_if_study2();
				
				ob1.TestGrade();
				
		

	}
	
	public void TestGrade()
	{
//		if my grade is 
//		A--> %>75
//		B--> %>=60 - <=75
//		C--> %>40 - <60
//		D--> fail
		
	    char Grade='C';
				
	    if (Grade=='A')
	    {
			System.out.println("Your marks are >75");
			
	    }
	    
	    else if (Grade=='B') 
	    {
			System.out.println("Your marks are >=60 to <=75");
		}
	    
	    
	    else if (Grade=='C')
	    {
	    	System.out.println("Your marks are >40 to <60");
			
		}
	    
	    else
	    {
	    	System.out.println("You are failed");
	    }
		
	}
	

}
