package controlflowStatment;

public class ForLoopDemo {
	public static void main(String args[])
	{
		//Hello statement 5 times 
		for (int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			
		}
		
		System.out.println("*************************");
		
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
			
		}
		System.out.println("*************************");
		
		for (int i=10;i>=1;i--)
		{
			System.out.println(i);
			
		}
		System.out.println("*************************");
		//print sum 100 naturals numbers = 5050
		int sum =0;
		for(int i=1; i<=100;i++)
		{
			 
			 sum=sum+i;
			
			
		}
		System.out.println("sum is: "+sum); 
		System.out.println("*************************");
		//print taple of 5
		
		int num=5;
		for(int i=1;i<=10;i++)
		{
			System.out.println("Table of 5: "+num*i); 
		}
		
	/*	for(;;)//Condition for for loop is true
		{
			System.out.println("Hi");//
			Infinte time
		}*/
		
		System.out.println("*************************");
		
		
	}

}
