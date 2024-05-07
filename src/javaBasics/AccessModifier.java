package javaBasics;

public class AccessModifier {
	
	
	//instance varriable
	int id=101; //deafult
	public String name="Sarang";
	private long phno =9414435719L;
	public static String lname="goyal";
	
	public static void main(String args[])
	{
		AccessModifier a1= new AccessModifier();
		System.out.println("Default: " +a1.id);
		System.out.println("public: " +a1.name);
		System.out.println("private: " +a1.phno);
		
		
	}

}
