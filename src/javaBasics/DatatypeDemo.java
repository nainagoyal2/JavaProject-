package javaBasics;

public class DatatypeDemo {
	
	
	public static void main(String args[]) 
	{
		//boolean true and false  1bit
		 boolean status =true;
		 System.out.println("Boolean datas is " +status);
	     status =false;
	     System.out.println("Boolean datas is " +status);
	     
	     System.out.println("************************* ");
		// Numeric -----> Char and Integral
	     /* char is data type can store  2 byte
	      * 1. Single character
	      * 2. Special character
	      * 3. AScii value for any character
	      * 0-9=48 to 57
	      * A-Z= 65 to 90
	      * a-z= 97  to 122
	      * 
	      * 
	      * */
	     
	     char c1= 'A';
	     System.out.println("character data is:  "+c1);
	     char c2 ='#';
	     System.out.println("Special character data is: " +c2);
	     char c3=90; //c3  accepting number as AScii  value for character Z
	     System.out.println("AScii character 90 is: "+c3);
	     char c4='1';
	     System.out.println("Numeric character data is: "+c4);
	     char c5=1;
	     System.out.println("AScii character 1 is: "+c5);
	
	     char c6=120; //c3  accepting number as AScii  value for character Z
	     System.out.println("AScii character 120 is: "+c6);
	     
	     System.out.println("************************* ");
	     
	     
	   // Numeric--->Integer Floating Point	
	     //Integer--->byte ---> short ---> int(default)  --->  long
		
		// byte 1byte -128 to 127
	     byte b1 = 125;
	     System.out.println("Byte data b1 is: "+b1);
	     
	     
	     byte b2= -128;
	     System.out.println("Byte data b2 is: "+b2);
	     byte b3= 127;
	     System.out.println("Byte data b3 is: "+b3);
	     
	    // System.out.print("Byte data is: "+b1+" "+b2+" "+b3);
	     
	     //Type mismatch: cannot convert from int to byte
	//     byte b4 =130;  out of Range
	     
	     
	     
	     // short 2 byte -32768 to 32767
		short s1 =130;
		System.out.println("Short data s1 is: "+s1);
		short s2= -32768;
		System.out.println("Short data s2 is: "+s2);
		short s3= 32767;
		System.out.println("Short data s3 is: "+s3);
		
		  //Type mismatch: cannot convert from int to short
		//short s4= 327478; out of Range
		
		int i1=327478;  //4BYTE
		System.out.println("Integer data i1 is: "+i1);
		int i2=32747899;
		System.out.println("Integer data i2 is: "+i2);
		//The literal(Constant) 9999999374383 of type int is out of range 
		//int i3=9999999374383;
		
		long l1 =9999999374383L;  //8BYTE
		System.out.println("long data l1 is: "+l1);
		
		System.out.println("************************* ");
		
		
		/*floating point
		 * 1. float 4 byte
		 * 2. double 8 byte (default)
		 * 
		 * */
		
		
		float f1 =34.5564533F;
		System.out.println("float data f1 is: "+f1);
		
		 double d1=34.5565486945994353534534534444;
		System.out.println("double data d1 is: "+d1);
		
		
		
	}
}
