package Assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int rem, sum=0;
		Scanner sc= new Scanner(System.in);
				System.out.println("Enter the number");
			int num=sc.nextInt();
			while(num>0)
			{
				 rem=num%10;
				 num=num/10;
				 sum=sum*10+rem;			 
			}
			System.out.println(sum);
			
				
			 
		
		sc.close();

	}

}
