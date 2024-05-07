package Assignment;

public class EmployeeData{
	int emp_ID;
	String emp_Name;
	public void display()
	{
		System.out.println("Enter the Employee id: "  +emp_ID);
		System.out.println("Enter the Employee name: " +emp_Name);
	}
	
	
	public static void main(String args[])
	{
		EmployeeData e1 =new EmployeeData();
		e1.emp_ID=101;
		e1.emp_Name="Preeti";
		e1.display();
		
		System.out.println("**********");
		
		
		
		EmployeeData e2 =new EmployeeData();
		e2.emp_ID=102;
		e2.emp_Name="Shobha";
		e2.display();
		
		System.out.println("**********");
		
		
		
		EmployeeData e3 =new EmployeeData();
		e3.emp_ID=103;
		e3.emp_Name="Radha";
		e3.display();
		
		System.out.println("**********");
		
		
		EmployeeData e4 =new EmployeeData();
		e4.emp_ID=104;
		e4.emp_Name="Deepti";
		e4.display();
		
		System.out.println("**********");
		EmployeeData e5 =new EmployeeData();
		e5.emp_ID=105;
		e5.emp_Name="Rakhi";
		e5.display();
		
		
		
	}

}
