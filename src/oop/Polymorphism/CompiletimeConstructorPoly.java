package oop.Polymorphism;

public class CompiletimeConstructorPoly {
	/*
	 * Constructor overloading
	 * When same name method and constructor is declared in same class with 
	 * different signature 
	 * 1. Number of arguments
	 * 2. Type of argumnets
	 * 3. Order of arguments
	 * 
	 * Constructor overloading is possible
	 * Constructor overriding is not possible
	 * 
	 * 
	 * Main() overloading is possible but overriding is not possible  
	 * 
	 * 	 * */
	
	
	public CompiletimeConstructorPoly()
	{
		System.out.println("Deafult constuctor");
	}
	//no of argument
	public CompiletimeConstructorPoly(String name)
	{
		System.out.println("Paramereized constuctor: " +name);
	}
	//Order of arguments
    public CompiletimeConstructorPoly(int id)
	{
		System.out.println("Paramereized constuctor: " +id);
	}
	
	
	
	//type of argument
	public CompiletimeConstructorPoly(String name, int id)
	{
		System.out.println("Paramereized constuctor: " +name+" & " +id);
	}
	public CompiletimeConstructorPoly(int id, String name)
	{
		System.out.println("Paramereized constuctor: " +id+" & " +name);
	}
	
	
	public static void main(String args[])
	{
		CompiletimeConstructorPoly p1= new CompiletimeConstructorPoly();
		CompiletimeConstructorPoly p2= new CompiletimeConstructorPoly("Sameer");
		CompiletimeConstructorPoly p3= new CompiletimeConstructorPoly(101);
		CompiletimeConstructorPoly p4= new CompiletimeConstructorPoly("Alok", 102);
		CompiletimeConstructorPoly p5= new CompiletimeConstructorPoly(103, "Naina");
	}

}
