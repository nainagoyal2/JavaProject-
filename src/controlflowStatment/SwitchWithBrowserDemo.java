package controlflowStatment;

import java.util.Scanner;

public class SwitchWithBrowserDemo {
		public static void main(String[] args) {
		 
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Browser name");
	    String bname=sc.nextLine();
	    /*
	     *In string class use to toUpperCase()  for upper case
	     * and toLowerCase  for lower case
	     * */
	    switch (bname.toLowerCase()) {
		case "chrome":
	    	 System.out.println("Test Case executing on chrome!");
			break;
		case "firefox":
	    	 System.out.println("Test Case executing on firefox!");
			break;
		case "edge":
	    	 System.out.println("Test Case executing on edge!");
			break;
			
			
		default:
			System.out.println("Please Enter is valid browser name");
			break;
		}
	    
	    
	    sc.close();
	  /*   if (bname.equalsIgnoreCase("Chrome"))
	     {
	    	 System.out.println("Test Case executing on chrome!");
	     }
	     else if (bname.equalsIgnoreCase("Firefox"))
		     {
		    	 System.out.println("Test Case executing on Firefox!");
		     }
	     else if (bname.equalsIgnoreCase("Edge"))
	     {
	    	 System.out.println("Test Case executing on Edge!");
	     }
	     else
	     {
	    	 System.out.println("Please Enter is valid browser name");
	    	 
	     }*/
	     
	    
	    
	    /*
	     * String is an immutable class
	     * String comparison we always used method
	     * 1. equals method()  Case Sensitive
	     * 2. equalsIgnoreCase() not Case Sensitive
	     * 
	     * 
	     * */
	  //  String s1="Hello";
	   // String s2="hello";
	   // System.out.println("equals():" +s1.equals(s2));
	   // System.out.println("equalsIgnoreCase():" +s1.equalsIgnoreCase(s2));
		}

}
