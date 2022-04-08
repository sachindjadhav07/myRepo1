package inheritance;

public class Multi_Level_Study {

	public static void main(String[] args)
	{
		Daughter_Multilevel d = new Daughter_Multilevel();
		d.mobile(); //calling properties from its own class
		d.scooty();
		Daughter_Multilevel.dress();
		
		d.look(); //calling properties from super class
		d.money();
		
		d.experience(); //calling properties from super most class
		d.Foodmaking();
		
		Mother_Multilevel m = new Mother_Multilevel();
		m.look(); //calling properties from its own class
		m.money();
		
		
		m.experience(); //calling properties from super most class
		m.Foodmaking();
		
		GrandMother_Multilevel g = new GrandMother_Multilevel();
		g.experience(); //calling properties from its own
		g.Foodmaking();
		

	}

}
