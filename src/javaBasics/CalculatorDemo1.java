package javaBasics;

public class CalculatorDemo1 {
	//instance method
	public void add()//method with 0 parameter and static concept
	{
		int a=100, b=200;//local variable
		
		System.out.println("addition is:"+(a+b));
	}
	
	
	//dynamic logic
	public void sub(int a , int b)//local variable and 2  parameter
	{
		//a=100 and b=50
		System.out.println("substraction is: "+(a-b));
		
		
	}
	
	public void mul(int a, int b)//a=10 and b=10
	{
		System.out.println("Multiplication is: "+(a*b));
		
	}
	
	//Method with return keyword
	/*
	 * 
	 * return keyword is used to return value/result from method 
	 * when we use return keyword we have to change return type method
	 * 
	 * 
	 * return keyword return data to calling function
	 * 
	 * */
	
	public int div(int a, int b)
	{
		return a/b;
		
	}
	public String info(String msg)

	{
		
		return msg;
	}

	public static void  main(String arg[])
	//calling function
	
	
	{
	//	int x=100;
		CalculatorDemo1 d1 =new CalculatorDemo1();
		d1.add();
		/*
		 * Compile time parameter passing
		 * when we pass data at the time of calling that function
		 * is called compile time 
		 * */
		//parameter passing without return keyword
		d1.sub(100, 50);
		d1.mul(10, 10);
		
		int result=d1.div(100, 10);
		System.out.println("Division is: "+result);
		
		
	String	data =d1.info("Hello All");
	System.out.println("Info is: "+data);
	
	
	
	}

}
