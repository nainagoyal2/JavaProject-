package collectionFramework;

import java.util.ArrayList;

public class ListScenario_Empolyee {

	public static void main(String args[])
	{
		Employee e1 =new Employee(101, "naina");
		Employee e2 =new Employee(102, "akash");
		Employee e3 =new Employee(103, "rekha");
		
		//create list of employee
		ArrayList<Employee> a1 = new ArrayList<Employee>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
		
	//	System.out.println(a1);
		
		for(Employee i:a1)
		{
			System.out.println(i.id +" "+ i.name);
		}
	}
}
