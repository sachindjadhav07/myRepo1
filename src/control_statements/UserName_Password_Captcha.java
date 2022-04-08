package control_statements;

public class UserName_Password_Captcha {

	public static void main(String[] args) {
		
		
		String UserName="Sachin";
		String Password="Sachin@123";
		String Captcha="Sachin12";
		
		if (UserName=="Sachin") 
		{
			System.out.println("UserName is correct please enter password");
			
			
			if (Password=="Sachin@123")
			{
				System.out.println("Password is correct please enter captcha");
			
			
			if (Captcha=="Sachin12")
			{
				System.out.println("Login Successful");
			}
			
			else
			{
				System.out.println("Incorrect Captcha");
			}
			
			}
			
			else
			{
				System.out.println("Incorrect Password");
			}
			
			
		}
		
		else
		{
			System.out.println("Invalid UserName");
		}

	}

}
