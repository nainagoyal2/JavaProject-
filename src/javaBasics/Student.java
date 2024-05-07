package javaBasics;

public class Student {
	//Data
	int id;
	String name;
	
	//Function ya method
	public void show()
	{
		System.out.println("Enter the id: "+id);
		System.out.println("Enter the name: "+name);
		//System.out.println(id);
		//System.out.println(name);
		
		
		
	}
	
	public static void main(String args[])
	{
		
		//calling function-object create inside the main
		Student s1 = new Student();
		
		/* how to access member of class? 
		 * using object name and . operator
		 * */
		//s1.show(); // initially default value is return
		s1.id=100;
		s1.name="naina";
		s1.show();
		
		System.out.println("*************");
		
		Student s2 = new Student();
		s2.id=101;
		s2.name="seema";
		s2.show();
		System.out.println("*************");
		
		
	}

}
