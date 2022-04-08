package type_variable;

public class Employee 
{
    String emp_name; //Global Non static Variable declaration 
	int emp_id;
	char emp_grade;
	float emp_salary;
	
	public void emp_info()
	{
		System.out.println("Employee Name is "+emp_name);
		System.out.println("Employee ID is "+emp_id);
		System.out.println("Employee Grade is "+emp_grade);
		System.out.println("Employee salary is "+emp_salary);
		System.out.println("=============================");
	}
	
	

}
