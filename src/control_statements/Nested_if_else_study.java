package control_statements;

public class Nested_if_else_study 
{
	
//	if username is correct then please enter password, if your password is correct then "Login successful" 
//	if password is wrong then please check your password, else incorrect username

	public static void main(String[] args)
	{
		String UserName="Sachin";
		String Password="Sachin@123";
		
		if (UserName=="Sachin") 
		{
			System.out.println("Username is correct, please enter your password");
			
			if (Password=="Sachin@123") 
			{
				System.out.println("Login successful");
				
			}
			
			else
			{
				System.out.println("Incorrect password");
			}
			
		 }
			else
			{
				System.out.println("Incorrect UserName please enter correct UserName");
			}
			
		}
		

	}


