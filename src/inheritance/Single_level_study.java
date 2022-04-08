package inheritance;

public class Single_level_study {

	public static void main(String[] args) 
	{
		Mother ob1= new Mother();
		ob1.look();
		ob1.money();
		
		Daughter ob2= new Daughter();
		ob2.mobile();
		ob2.scooty();
		ob2.look();
		ob2.money();
		
		Daughter.dress();
		
		

	}

}
