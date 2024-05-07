package collectionFramework;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 *  TreeSet is child class implement Sortset which extends set interface
	 * Undeeline(Based on) data structure is search tree
	 * HashSet is faster than treeSet
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
	    TreeSet<Integer> ts = new TreeSet<Integer>();
	 
		ts.add(10);
		ts.add(2);
		ts.add(8);
		ts.add(7);
		ts.add(4);
		ts.add(20);
		ts.add(5);
		ts.add(3);
		ts.add(1);
		
		   System.out.println("IS TreeSet is empty " +ts.isEmpty());
		   System.out.println("IS TreeSet is size() " +ts.size());
		   
		   
		   //ascending
		   System.out.println(ts);
		   
	       System.out.println("IS TreeSet is contains() " +ts.contains(10));
		   
		   System.out.println("IS TreeSet is contains() " +ts.contains(11));
		    
		   System.out.println(ts.descendingSet());
		   
		   
		   System.out.println("Less than element 10: "+ts.headSet(10));
		   
		   System.out.println("Greater than  and equal to element 10: "+ts.tailSet(10));
		   
		   System.out.println("Subset: "+ts.subSet(2, 10));
		   
		   
		   TreeSet<String> ts1 = new TreeSet<String>();
		   ts1.add("naina");
		   ts1.add("taina");
		   ts1.add("zaina");
		   ts1.add("yaina");
		   System.out.println(ts1);
		   
	 //   ts.remove(1);
	  
	   // System.out.println(ts);
	    

		}
	

}
