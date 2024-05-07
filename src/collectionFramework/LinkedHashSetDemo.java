package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	/*
	 *  LinkedHashSet is child class for Hashset interface
	 * Undeeline(Based on) data structure is doubly linked list
	 * it has feature of list and set interface
	 * it is ordered collection
	 * it never allow duplication
	 * 
	 * 
	 * */

	public static void main(String[] args) {
    LinkedHashSet<Integer> ls = new LinkedHashSet<Integer>();
 
	   ls.add(40);
	   ls.add(10);
	   ls.add(20); 
	   ls.add(null);
	   ls.add(50);
	   ls.add(10);
	   ls.add(20); 
	   ls.add(null);
	
	   System.out.println("IS LinkedHashSet is empty " +ls.isEmpty());
	   System.out.println("IS LinkedHashSet is size() " +ls.size());
	   System.out.println(ls);
	   
   System.out.println("IS LinkedHashSet is contains() " +ls.contains(10));
	   
	   System.out.println("IS LinkedHashSet is contains() " +ls.contains(11));
    ls.remove(20);
    ls.remove(null);
    System.out.println(ls);
    

	}

}
