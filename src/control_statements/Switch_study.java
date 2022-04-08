package control_statements;

public class Switch_study {

	public static void main(String[] args) {
		
//		if my year is
//		
//		1--> I am in first year of engineering
//		2--> I am in second year of engineering
//		3--> I am in third year of engineering
//		4--> I am in fourth year of engineering
		
		int Year=3;
		
		switch (Year) 
		{
		case 1: System.out.println("I am in 1st year of engineering");
			
			break;
	    
		case 2: System.out.println("I am in 2nd year of engineering");
		    
		    break;
		    
		case 3: System.out.println("I am in 3rd year of engineering");
		 
		    break;
		    
		case 4: System.out.println("I am in 4th year of engineering");
		     
		    break;

		default: System.out.println("Please enter valid year between 1 to 4");
		    break;
		    
		    
		    
		}
		
		

	}

}
