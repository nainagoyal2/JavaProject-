package oop.DataAbstraction;

public class TestShape {

	public static void main(String[] args) {
		//child ref and child object
		Circle c1= new Circle();
		c1.areaOfShape();//inherited abstract
		c1.show();//indiviual
		System.out.println("***************");
		Rectangle r1 = new Rectangle();
		r1.show();
		r1.areaOfShape();
		System.out.println("***************");
		//parent ref and child object
         Shape p1 = new Circle();
         p1.areaOfShape();//indiviual
         
         Shape p2 = new Rectangle();
         p2.areaOfShape();
	}

}
