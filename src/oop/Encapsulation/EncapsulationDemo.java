package oop.Encapsulation;

public class EncapsulationDemo {
	public static void main(String args[])
	{
		EmployeeDetails e2 = new EmployeeDetails();
		e2.Display();
		//e2.id=102;
	//e2.name="Naina";
	//	e2.Display();
		e2.setId(301);
		e2.setName("abhi");
		int i= e2.getId();
	System.out.println(i);
	System.out.println(e2.getName());
	}

}
