package oop.DataAbstraction;

public class Circle implements Shape{
	

	@Override
	public void areaOfShape() {
		//x=200;//the final field Shape.x cannot be assigned
		System.out.println(x);
		System.out.println("Area of Circle is: "+(3.14*3*3));
		
	}

	
	public void show()
	{
		System.out.println("This is circle shape");
	}
}
