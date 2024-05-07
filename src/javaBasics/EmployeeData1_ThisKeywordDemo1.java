package javaBasics;

public class EmployeeData1_ThisKeywordDemo1{
	
	//-this keyword used to differentiate between instance and local variable
	int emp_ID;
	String emp_Name;
	

	
	EmployeeData1_ThisKeywordDemo1(int emp_ID, String emp_Name) //local data 
	{
		//Initialized Instance variable
		//local data to local variable
		
		//emp_ID= emp_ID;
		//emp_Name=emp_Name;
		
		
		//local data to instance variable
		this.emp_ID= emp_ID;
		this.emp_Name=emp_Name;
	
	}
	public void display()
	{
		System.out.println("Enter the Employee id: "  +emp_ID);
		System.out.println("Enter the Employee name: " +emp_Name);
	} 
 
	
	public static void main(String args[])
	{
		EmployeeData1_ThisKeywordDemo1 e1 =new EmployeeData1_ThisKeywordDemo1(101, "naina");
		e1.display();
	
		
		
		
	}

}
