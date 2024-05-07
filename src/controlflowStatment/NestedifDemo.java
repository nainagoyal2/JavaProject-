package controlflowStatment;

import java.util.Scanner;

public class NestedifDemo {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your marks");
		int marks=sc.nextInt();
		
	
    if(marks>=90)
    {
    	 if(marks>=96)
    	 {
    		 System.out.println("A++");
    	 }
    	 else
    	 {
    		 System.out.println("A");
    	 }
    }
    	 else
    	 {
    		 System.out.println("B");
    	 }
    		 
    sc.close();
    }

	}


