package type_variable;

public class HR_Portal {

	public static void main(String[] args) 
	{
		Employee ob1= new Employee();
		ob1.emp_id=1234;
		ob1.emp_name="sachin";
		ob1.emp_salary=50000.5f;
		ob1.emp_grade='A';
		
		ob1.emp_info();
		
		Employee ob2=new Employee();
		
		ob2.emp_name="pradnya";
		ob2.emp_grade='A';
		ob2.emp_salary=50000.6f;
		ob2.emp_id=12345;
		
		ob2.emp_info();
		
			
	
		
		
	}

}
