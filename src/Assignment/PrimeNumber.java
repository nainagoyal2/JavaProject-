package Assignment;

public class PrimeNumber {
	
	//2. Write a Java Program to find prime numbers between 1 to 100
	
	public static void main(String args[])
	{
		for(int j=1;j<=100;j++)
		{
		int count=0;
		for(int i=1;i<=j;i++)
		{
			if(j%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(j+ " it is prime number");
			}
			else 
			{
				System.out.println(j+  " it is not prime number");
			}
		}
			
		}
	}
			
		
		
	
		

	



