package controlflowStatment;

import java.util.Scanner;

public class IfElseDemo {
	public static void main(String args[])
	{
		
		System.out.println("Example1");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		if(num1>num2)
		{
	      System.out.println(num1+ " Greater than "+num2);
		}
		else
		{
			 System.out.println(num2+" Greater than "+num1);
		}
		
		System.out.println("Example2");
	
		System.out.println("Enter the age");
		int age= sc.nextInt();
		if (age>=18)
		{
			System.out.println("Valid age!");
			
		}
		else
		{
			System.out.println("Invalid age!");
		}
		
		
		sc.close();
		
				
		
	}
	

}
