package javaBasics;

public class VarriableDemo {
	
	int id=101;//instance variable
	String name="naina";//instance variable
	static String orgName="StarAgile";  //Static Variable
	/*
	 * Instance variable get different memory for every different object
	 * Static variable get one time memory and its share same memory with 
	 * all different objects
	 */

	
	public void info()
	{
		int marks=90;  //local variable
		System.out.println("marks from info():  "+marks );
		
		
		
	}
	
	public static void main(String args[])
	{
		int marks=102; //local variable
		
		System.out.println("marks from main():  "+marks );
		
		VarriableDemo v1 = new VarriableDemo();
		
		v1.info();
		System.out.println(v1.id);
		System.out.println(v1.name);
		System.out.println(orgName);
	}

}
