package javaBasics;

public class FirstCode {
	
	
	//Entry point and exit point  ----- Single line comment
	public static void main (String arg[])
	{
		
		System.out.println("Hello Everyone!");
		
		System.out.println("*******Another class**************");
		
		//ANOTHER CLASS
		MethodDemo.show();
		System.out.println("*******Another class*****");
		
		
		EmployeeData e5 =new EmployeeData();
	
		e5.emp_ID=102;
		e5.emp_Name="NAINA";
		e5.display();
	}
	

}
