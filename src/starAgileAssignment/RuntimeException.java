package starAgileAssignment;
import java.util.Scanner;
public class RuntimeException {
   //	Write a Java Program to handle given uncheck exception

	int id=101;
    public static void main(String[] args) 
	{
    System.out.println("**********ArrayIndexOutOfBound*******************");
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
	
	   System.out.println("********* NullPointerException*******************");
	   RuntimeException d1 = new RuntimeException();
	    d1 =null;  //NullPointerException: 
		
		try {
		System.out.println(d1.id);
	}
		catch(NullPointerException n)
		{
			 System.out.println("check object which is null");
		}
		
	  
	

}
    }
	


