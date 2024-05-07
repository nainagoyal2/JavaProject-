package Assignment;

public class CalculatorAssignment {
	
	public int add(int a, int b)
	{
		return a+b;
		
	}
	public long sub(long a, long b)
	{
		return a-b;
	}
	
	public float mul(float a,float b)
	{
		return a*b;
	}
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public double mod(double a,double b)
	{
		return a%b;
	}	
	
	
	public static void main(String args[]) 
	
	{
	CalculatorAssignment c1 = new CalculatorAssignment();
	
	
	
      int a1=	c1.add(10, 10);
      System.out.println("Add is: " +a1);
      long b1=	c1.sub(20L, 10L);
      System.out.println("Sub is: " +b1);
      float d1=	c1.mul(10.5F, 10.5F);
      System.out.println("Mul is: " +d1);
      int e1	=c1.div(20, 5);
      System.out.println("Div is: " +e1);
      double f1 =	c1.mod(18.5,2.5);
      System.out.println("Mod is: " +f1);
		
		
	}

}
