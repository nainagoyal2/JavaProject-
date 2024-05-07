package javaBasics;

public class TypeCasting {
	
	public static void main(String args[]) 
	
	
	{
		/*
		 * Conversion of one type data into another type is called type casting
		 * 1. Primitive to primitive (Implicit and Explicit )
		 * 2. Primitive to object (Autoboxing-Wrapper class)
		 * 3. object to primitive (Unboxing-Wrapper class)
		 * 
		 * 
		 * 
		 *  byte ---> short --->char---> int  --->  long
		 *   -->float --->double
		 * 
		 * */
		
		//Primitive to primitive
		//Implicit (aUTOMATIC CONVERSION (JVM)
		//Small ---> Large
		byte b1 =127;
		int a1 =b1;
		System.out.println("byte to intger conversion a1 is :"+a1);//127
		char ch='A';
		int a2 =ch;
		System.out.println("character to integer conversion a2 is: "+a2);//65
		
		int a3 =99;//4 byte
		float f1=a3;//4 byte
		System.out.println("integer to convert float f1 is: " +f1);//99.0
		
		long l1 =342343L;
		float f2=l1;// both are different family so its possible
		System.out.println("long to convert float f2 is: " +f2);//342343.0
		
		int i16= 473474357; //4byte
		long l6=i16;
		System.out.println("int to convert long l6" +l6);		
		
		
		System.out.println("*****Explicit Casting******");
		
		//Explicit Casting -Manual conversion (add casting operator)
		//large---> small(reverse implicit)
		
		
		
		float f3 =342343.4F;//4byte
		// Type mismatch: cannot convert from float to long
		long l2=(long)f3;
		System.out.println("float to long Explicit: " +l2);
		int i6 =120;//4byte
		// Type mismatch: cannot convert from float to long
	    char c9=(char)i6;
		
		System.out.println("long to char Explicit: " +c9 );
		
		long l4=999999999999L;
		int i10=(int)l4;
		
		System.out.println("long to int Explicit: " +i10 );
		
		
	}
	

}
