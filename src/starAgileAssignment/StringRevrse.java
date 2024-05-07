package starAgileAssignment;

import java.util.Scanner;

public class StringRevrse {
	
	//Write a Java program to reverse a string with and without reverse() function

	public static void main (String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the course name");
	    String course=sc.nextLine();
	    System.out.println("***Without Method***");
        String rev="";
	  for (int i=course.length()-1; i>=0;i--)
	  {
		rev=rev+course.charAt(i);

	  }   
		System.out.println(rev);
		
		System.out.println("***With Method***");
		StringBuilder br=new StringBuilder(course);
		System.out.println(br);
		System.out.println(br.reverse());
		sc.close();
       }

}
