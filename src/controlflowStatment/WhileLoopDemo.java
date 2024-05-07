package controlflowStatment;

public class WhileLoopDemo {
	public static void main (String args[])
	{
		int i =1;
		while(i<=10)
		{
			System.out.println("Hello");
			i++ ;
		}
		
		System.out.println("*************************");
		int num=234;
		int rem;
		int sum=0;
		while(num>0)
			
		{
			rem=num%10; //4,3
			num=num/10;  //23,2
			System.out.println(num);
			sum=sum+rem;  //4,7,9
			
		}	
		
		System.out.println(sum);
		
		System.out.println("**********Do While***************");
		int x=1;
		do {
			
			System.out.println("Hello");
			x++;
		}
		while(x>10);
			
		
		
		
	}

}
