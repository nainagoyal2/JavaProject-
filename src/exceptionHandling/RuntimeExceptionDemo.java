package exceptionHandling;

import java.util.Scanner;

public class RuntimeExceptionDemo {

	
	int id=101;

	public static void main(String[] args) {
	
		
		RuntimeExceptionDemo d1 = new RuntimeExceptionDemo();
		
		d1 =null;  //NullPointerException: 
		
		try {
		System.out.println(d1.id);
	}
		catch(NullPointerException n)
		{
			 System.out.println("check object which is null");
		}
		
		
		
		
		
		
		System.out.println("******************");
		
		
		String s1 ="100aa";
		try {
		int a1= Integer.parseInt(s1);//NumberFormatException:4
		System.out.println(a1+100);
		}
		
		catch(NumberFormatException t)
		{
			System.out.println("Please enter the valid string with number");
		}
		

		
		
		System.out.println("******************");
		
		
		
		
		
		
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Valid index 0 to 4");
		int index= sc.nextInt();
		int arr[]= {10,20,30,40,50};
		try {
		System.out.println(arr[index]);// java.lang.ArrayIndexOutOfBoundsException:

		}
		catch(Exception t1)
		{
			System.out.println("please enter the valid index!"+t1.getMessage());
		}
		
		System.out.println("******************");
		
		
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the to number");
		int num1 =sc1.nextInt();
		int num2 =sc1.nextInt();
		System.out.println("Addition two number: " +(num1+num2));
		System.out.println("Substractio two number: " +(num1-num2));
		try {
		System.out.println("division two number: " +(num1/num2));//ArithmeticException
		}
		catch(Exception h)
		{
			System.out.println("please enter valid number other than 0");
		}
		System.out.println("multiple two number: " +(num1*num2));
		sc.close();
		sc1.close();
	}

}
