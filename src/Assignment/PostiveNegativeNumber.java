package Assignment;

import java.util.Scanner;

public class PostiveNegativeNumber {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =sc.nextInt();
		if (num>=0)
		{
			System.out.println(num+" Postive Number");
		}
		else
		{
			System.out.println(num+" Negative Number");
		}
		sc.close();
		
	}

}
