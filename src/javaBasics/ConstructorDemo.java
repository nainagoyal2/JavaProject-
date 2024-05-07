package javaBasics;

import java.util.Scanner;

public class ConstructorDemo {
	//instance Variable
	int id;
	String name;

	//deafult constructor
	ConstructorDemo()
	{
		System.out.println("Default Constructor is calling!");
		System.out.println(id);
		System.out.println(name);	
	}
	ConstructorDemo(int i , String n)// i=101 n :naina

	{
		System.out.println("Parameteried Constructor is calling!"); 	
		id = i;
		name=n;

		System.out.println(id);
		System.out.println(name);

	}
	public void show()
	{
		System.out.println("method is calling!");
		
		System.out.println(id);
	    System.out.println(name);
		
	}
	
	

	public static void main(String[] args) 
	{
		  /*   ConstructorDemo c1 = new ConstructorDemo();//default con
         c1.show();
		ConstructorDemo c2 = new ConstructorDemo(101, "naina");//parameterized constructor 
		c2.show();*/
         
     Scanner s1 = new Scanner(System.in);
		
		
		System.out.println("Enter name");
		
		String n1=s1.nextLine();
		
		System.out.println("Enter id");
		int i1 =s1.nextInt();
		ConstructorDemo c4 = new ConstructorDemo();
		c4.show();
		c4.id=303;
		c4.name="goyal0";
		c4.show();
		
		ConstructorDemo c3 = new ConstructorDemo(i1,n1);
		
		c3.show(); 
		s1.close();
	}

}
