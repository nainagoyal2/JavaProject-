package com.practice;

import java.util.ArrayList;

import java.util.Scanner;


public class ArrayLIstInteger {

	public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	int size =4;
	
	System.out.println("Please enter the number");
	for (int i=0; i<size-1; i++)
	{
	int a=sc.nextInt();
	a1.add(a);
	
	
	}

	System.out.println(a1);
	System.out.println("*************");
	
	
     
    for(int j=a1.size()-1;j>=0;j--)
    {
      int e= a1.get(j);
      System.out.print("" +e +" "+ "");
    	
    }
 
    sc.close();
    
  //  System.out.println("*************");
    
    
	/*
	 * Collections.reverse(a1); System.out.println(a1);
	 * 
	 * System.out.println("************2"); for(int a11= size-1; a11<0; a11--) {
	 * System.out.println(a11); }
	 * 
	 * 
	 * System.out.println("************2"); TreeSet<Integer> t1 = new
	 * TreeSet<Integer>(a1); System.out.println(t1);
	 * 
	 * 
	 * System.out.println(t1.descendingSet()); sc.close();
	 */
    
	}
	
	

	}




