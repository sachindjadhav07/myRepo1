package string;

public class Reverse_String_By_Using_Concatination_Operator {

	public static void main(String[] args) 
	{
		
		
		String s="Velocity";
		
		String rev="";
		
		int length= s.length();
		
		for(int i=length-1; i>=0; i--)
		{
			rev=rev+s.charAt(i);
		
		}
		
		System.out.println("Reverse String is "+rev);
		
		
		System.out.println("==================================");
		
		
		String s1="Sachin";
		
		String rev1="";
		
		int length1=s1.length();
		
		for(int i=length1-1; i>=0; i--)
		{
			rev1=rev1+s1.charAt(i);
		}
		
		System.out.println("Reverse String is "+rev1);
		
		
		System.out.println("==================================");
		
		String s2="Jadhav";
		
		String rev2="";
		
		int length3=s2.length();
		
		for(int i=length3-1; i>=0; i--)
		{
			rev2=rev2+s2.charAt(i);
			
		}
		
		System.out.println("Reverse String is "+rev2);
		

	}

}
