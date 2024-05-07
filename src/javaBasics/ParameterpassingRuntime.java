package javaBasics;

import java.util.Scanner;

public class ParameterpassingRuntime {
	public void addition(int a, int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	public int sub(int a, int b)
	{
    int	c=a-b;
	return c;
		
	}
	
	public static void main(String args[])
	{
		Scanner s1  =new Scanner (System.in);
		System.out.println("Enter two number");
		int num1 =s1.nextInt();
		int num2 =s1.nextInt();
		//class level object
		ParameterpassingRuntime p1 = new ParameterpassingRuntime();
		//Run time parameter passing
		p1.addition(num1, num2);
		int result= p1.sub(num1, num2);
	//	System.out.println(p1.sub(num1, num2));
		System.out.println("Result is: "+result);
		s1.close();
	}

}
