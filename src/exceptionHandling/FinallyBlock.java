package exceptionHandling;

public class FinallyBlock {
	
	
	/*
	 * Finally block is used to excute some special code /logic
	 * with exception and without exception
	 * 
	 * 
	 * 
	 * try-finally
	 * 
	 * 
	 * 
	 * */
	
	
public static void main(String args[])
{
	
System.out.println("PROGRAM STARTED");
try {
System.out.println(9/0);
}
catch(Exception t)

{
	System.out.println("write correct number other than 0");
	}
finally {
	 System.out.println("finally block is excuted for special /comman code");
}
System.out.println("ended STARTED");

}
}
