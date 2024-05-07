package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSetDemo {

	
	/*
	 * HashSet is class implement is set interface
	 * Underline data structure is HashTABLE
	 * In hash table object is stored as per hashing mechanism
	 * what is hashcode for null object =0
	 * 
	 * 
	 * Node:
	 * key|Hash code |object |address of next
	 * Hashtable internally create 16 virtual segment (0-15)
	 * hashest is not ordered collection
	 * it is not allow duplication
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
	   HashSet<Integer> hs = new HashSet<Integer>();
	   
	   hs.add(10);
	   hs.add(40);
	   hs.add(50);
	   hs.add(10);
	   hs.add(20); 
	   hs.add(90);
	   hs.add(null);
	   System.out.println("IS hashset is empty " +hs.isEmpty());
	   System.out.println("IS hashset is size() " +hs.size());
	   System.out.println(hs);
	   System.out.println("IS hashset is contains() " +hs.contains(null));
	   
	   System.out.println("IS hashset is contains() " +hs.contains(11));
	   
	   hs.remove(20);
	   System.out.println(hs);
	   System.out.println("****************");
	   ArrayList<Integer> a1 = new ArrayList<Integer>();
	   a1.add(100);
	   a1.add(200);
	   a1.add(250);
	   a1.add(459);
	   a1.add(45);
	   a1.add(250);
	   a1.add(459);
	   System.out.println(a1.size());
	   System.out.println(a1);
	   /*
	    * to remove duplicate  elements from list
	    * convert list intto set
	    * 1. addAll()
	    * 
	    * 
	    * */
	   
	   //passing list into constructor
	   System.out.println("********Using constructor()************");
	   HashSet<Integer> hs1 = new HashSet<Integer>(a1);
	   System.out.println(hs1);
	   
	   System.out.println("********Using addall()************");
	   
	   HashSet<Integer> hs2 = new HashSet<Integer>();
	   hs2.addAll(a1);
	   System.out.println(hs1);
	   
	//   Collections.sort(hs1);he method sort(List<T>) // the type Collections is not applicable
	   //for the arguments (HashSet<Integer>)
	   /*
	    * How to sort set element
	    * convert set to list
	    * 
	    * 
	    * */
	   ArrayList<Integer> a2 = new ArrayList<Integer>(hs2);
	   Collections.sort(a2);
	   System.out.println(a2);
	   

	} 

}
