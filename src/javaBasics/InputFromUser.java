package javaBasics;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class InputFromUser {

	
	
	public static void main(String args[]) throws IOException
	{
	/*Scanner class:predefined class
	 * package name util
	 * different method name
	 * String:nextLine()
	 * int:nextInt()
	 * double:nextDouble()
	 * 
	 * next() and nextLine() method is only difference next() method not condsider white space
	 * but nextLine is consider white space
	 * 
	 * 
	 * System.in:System is predefined class and in is object (Input stream) 
	 * it help read something from  the console
	 * System.out: OUTPUT STREAM 
	 * 
		*/
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		 System.out.println("Enter your age:");
		 int age=sc.nextInt();
		 System.out.println("Hello your name is :"  +name+  " and age is "+age);
		sc.close();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		/*	
	 *Its is lengthy process so dont follow
	 * System.out.println("Enter your age: ");
		InputStreamReader ir= new InputStreamReader(System.in); 
	BufferedReader br = new BufferedReader(ir);
	String s1=	br.readLine();
	//STRING TO int 
	int age=Integer.parseInt(s1);
	 System.out.println( age);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	
	 read () reads data as single character and return its (AScii)/int value
	 System.out.println("Enter your age: ");
	 int age=System.in.read();
	 System.out.println( age); */
		
		
		
		
		
		
		
	}

}
