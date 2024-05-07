package oop.Polymorphism;

public class CompiletimeMethodPoly {
	/*
	 * Method overloading
	 * When same name method and constructor is declared in same class with 
	 * different signature 
	 * 1. Number of arguments
	 * 2. Type of argumnets
	 * 3. Order of arguments
	 * 
	 * */
	
	public void add()//zero
	{
		int a=100, b=200;
		System.out.println(+(a+b));
	}
	
	
	//1. Number of arguments
	public void add(int a,int b)//

	{
	System.out.println("additin is a & b: "+(a+b));	
	}
	
	
	public void add(int a,int b , int c)//

	{
	System.out.println("additin is a, b & c: "+(a+b+c));	
	}
	//2. Type of argumnets
	public void add(double a,int b)//

	{
	System.out.println("additin is a & b: "+(a+b));	
	}
	
	//3. Order of arguments
	public void add(int a,double b)//

	{
	System.out.println("additin is a & b: "+(a+b));	
	}
	
	
	
	
	public static void main(String args[])
	{ 
		CompiletimeMethodPoly p1= new CompiletimeMethodPoly();
		p1.add();
		p1.add(20, 30);
		p1.add(40, 40, 60);
		p1.add(34.56, 70);
		p1.add(34.5, 30);

	 
	}

}
