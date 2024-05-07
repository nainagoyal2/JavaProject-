package javaBasics;

public class ThisKeywordDemo3 {
//-used to invoked any constructor
	ThisKeywordDemo3()
	{
		
		this("Amit");
	
		System.out.println("Deafault Constructor is calling!");
		//Constructor call must be the first statement in a constructor
		//this("Amit");
	}
	
	ThisKeywordDemo3(String name)
	{
	//	this();
		System.out.println("Parameterized Constructor is calling!" +name);
	}
	
	public static void main(String[] args) {
		ThisKeywordDemo3 t2=new ThisKeywordDemo3();//DEFAULT constructor
	//	ThisKeywordDemo3 t3=new ThisKeywordDemo3("naina");//Parameterized constructor
		
	}

}
