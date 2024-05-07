package Assignment;

import java.util.Scanner;

public class LadderIFgretaerNumber {
	
	
	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int num3 =sc.nextInt();
	int num4 =sc.nextInt();
	if(num1>num2 && num1>num3 && num1>num4)
	{
		System.out.println(num1+ " is greater than " +num2+ " and " +num3 + " and " +num4);
	}
	else if(num2>num1 && num2>num3 && num2>num4)
	{
		System.out.println(num2+ " is greater than " +num1+ " and " +num3 + " and " +num4);
	}
	else if(num3>num1 && num3>num2 && num3>num4)
	{
		System.out.println(num2+ " is greater than " +num1+ " and " +num3 + " and " +num4);
	}
	else
	{
		System.out.println(num4+ " is greater than " +num1+ " and " + num3 + " and " +num4);
	}
	
	
	
	
	sc.close();
	}

}
