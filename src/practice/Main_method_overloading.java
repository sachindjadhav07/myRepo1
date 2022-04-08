package practice;

public class Main_method_overloading {

	public static void main(String[] args) 
	{
		System.out.println("public static void main(String[] args)");
	}
	
	public static void main(String args)
	{
		System.out.println("public static void main(String args)");
	}
	
	public static void main()
	{
		System.out.println("public static void main()");
	}
	
	public static void main1()
	{
		System.out.println("a");
	}
	
	public static void abc (String[] args) 
	{
		System.out.println("b");
	}

}
