package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListScenario2 {
	public static void main(String args[])
	
	{
		
		/*
		 * Arrays is class in java
		 * 
		 * */
		
	      List<Integer> l1 =	Arrays.asList(10,20,30);
	      List<Integer> l2 =	Arrays.asList(40,50,60);
	      List<Integer> l3 =	Arrays.asList(70,80,90);

	      
	      System.out.println("List 1" +l1);
	      System.out.println("List 2" +l2);
	      System.out.println("List 3" +l3);
	      ArrayList<List<Integer>> finalList =new ArrayList<List<Integer>>();
	      finalList.add(l1);
	      finalList.add(l2);
	      finalList.add(l3);
	      System.out.println(finalList);
		
		System.out.println("************************");
		ArrayList<Integer> l4 = new ArrayList<Integer>();
	     l4.addAll(l1);
	     l4.addAll(l2); 
	     l4.addAll(l3);
	     System.out.println(l4);
	     
	     Collections.reverse(l4);
	     System.out.println(l4);
	   
	}

}
