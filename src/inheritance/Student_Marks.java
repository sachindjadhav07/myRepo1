package inheritance;

public class Student_Marks extends Student_Info
{
	
	int M1=75,M2=77,M3=87,M4=88,M5=97;
	
	int Percentage;
	
	public void Result()
	{
		Percentage=(M1+M2+M3+M4+M5)/5;
		System.out.println("Percentage is "+Percentage);
	}
	

}
