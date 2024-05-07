package com.practice;

import java.util.Scanner;

public class Replace {
//Puneet Kumar Mangal
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  name");
	     String s1=	sc.nextLine();
	     
	     System.out.println(s1);
	    String s2= s1.replace('e', 's');
	     System.out.println(s2);
	     
	     System.out.println("Remove spacing between the word in above string.");
	     String s3=s1.replaceAll(" ", "");
	     
	     System.out.println(s3);
	     
	     
	     
	     System.out.println("Remove white space from the string String s=chromebrowsr ");
	     String t1= "chromebrowsr    ";
	     System.out.println(t1);
	     System.out.println(t1.trim());
	     
	     System.out.println("Calculate no of words in a string S=\"Star Agile Training Program");
	     
	     String t2="Star Agile Training Program"; 
	     String[] word=t2.split(" ");
	     for(int i=0;i<4;i++)
	     {
	     System.out.println(word[i]);
	     
	     }
	     System.out.println(word.length);
	     
	     
	    
	    
	     
	    System.out.println("Convert string in to integer and if any exception then print exception."); 
	     
	     String p1="100";
	     String p2="234D";
	  int a =   Integer.parseInt(p1);
	     System.out.println(a);
	     try
	     {
	     int b =Integer.parseInt(p2);
	     System.out.println(p2);
	     }
	     catch(Exception a1) 
	     {
	    	 System.out.println("Please enter the valid string name");
	     }
	     
	     
	     
	     
	     
	     sc.close();

	}

}
