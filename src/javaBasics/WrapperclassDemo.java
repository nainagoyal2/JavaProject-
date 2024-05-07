package javaBasics;

public class WrapperclassDemo {
	public static void main(String Args[])
	{
		/*
		 * Wrapper class is predefined class in java
		 * to use primitive data in the form of object we use wrapper class
		 * in collection framework we use wrapper class only
		 *
		 * */
		//Primitive to object:
		int a=100;
		System.out.println("primitive data: "+a);
		//iNTEGER Wrapper class
		
		Integer i1=Integer.valueOf(a);
		System.out.println("primitive to object: "+i1);
		
		
		double d1=89.45;
		Double d2= Double.valueOf(d1);
		System.out.println("primitive to object: "+d2);
		
		
		
		//object to primitive (Unboxing)
		Integer i2=120;//object
		int i4=i2.intValue();
		
		float b=i2.floatValue();
		
		
		System.out.println("object(INTEGER) to primitive(int) : "+i4);
		System.out.println("object(INTEGER) to primitive(float) : "+b);
		
		
		Float f1=54.90F;
		float f2=f1.floatValue();
		System.out.println("object(Float) to primitive(float) : "+f2);

		/*
		 * Test case is : test bill amount as 1800
		 
		String msg="Total bill is 1800 Thank you for your order!";
		int expamount=1800;
		String data=msg.split(" ")[3];
		int amount=Integer.parseInt(data);
		
		if(amount==expamount)
		{
			System.out.println("Amount matched..Test pass!");
		}
		*/
		
		
		
	}

}
