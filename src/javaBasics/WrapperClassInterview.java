package javaBasics;

public class WrapperClassInterview {
	public static void main(String args[])
	{
		
		//object to primitive (Unboxing)
		//String s1="100abc";
		String s1="100";
		System.out.println(s1+100);//100100
		
		//result=200
		
		int a=Integer.parseInt(s1);
		System.out.println(a+100);//200
		
		
		String s2="67.67";
		double d1= Double.parseDouble(s2);
		System.out.println(d1+11.11);//78.78
		//primitive to string object
		
		
		
		
		int a1=100;
		System.out.println(a1+100);//200
		String ss1=String.valueOf(a1);
		System.out.println(ss1+100);//100100
		
	}

}
