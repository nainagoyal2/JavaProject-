package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo2_Iteration {
	public static void main(String args[])
	{
	
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	/*
	 * Scanner sc = new Scanner (System.in);
	 * 
	 * System.out.println("Please enter the number"); for(int i=0;i<=10;i++) {
	 * 
	 * int i1=sc.nextInt(); a1.add(i1); } sc.close();
	 */
	
	
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(20);
	a1.add(50);
	System.out.println("*******Simple For loop***********");
	//get (index)
	for(int i=0;i<a1.size();i++)
	{
		System.out.println(a1.get(i));
	}
	
	System.out.println("*******For each loop***********");
	for(Integer i :a1)
	{
		System.out.println(i);
	}
	System.out.println("*******Iterator loop***********");
	
	/*
	 * iterator() return Iterator interface object
	 * hasNext():Returns true if the iteration has more elements
	 * next() :Returns the next element in the iteration.
	 * */
	
      Iterator<Integer> ir=	a1.iterator();
    
      
      while(ir.hasNext())
      {
    	  System.out.println(ir.next() );
    	  
      }
}
}