package collectionFramework;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	/*Linked list is class implements list interface
	 * Underline data structure is doubly linked list
	 * linked list is best choice when operation insertion and delete
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
	LinkedList<Integer> l1 = new LinkedList<Integer>();
	
	System.out.println("Linked list intial is empty: " +l1.isEmpty());
	if(l1.isEmpty())
	{
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(10);
		l1.add(20);
		
	}
	System.out.println("Linked list after is empty: " +l1.isEmpty());
	
	
	System.out.println("Linked list size: " +l1.size());
	System.out.println(l1);
	
	System.out.println("is linked list 10 is available: "+l1.contains(10));
	System.out.println("is linked list   is available: "+l1.contains(40));
	l1.addFirst(100);
	System.out.println(l1);
	l1.addLast(200);
	System.out.println(l1);
	System.out.println(l1.getFirst());
	System.out.println(l1.getLast());
	l1.removeLast();
	System.out.println(l1);
	//sort
	System.out.println("**");
	Collections.sort(l1);
	System.out.println(l1);
	
	
	
	System.out.println("**");
	LinkedList<Integer> l2 = new LinkedList<Integer>();
	System.out.println(l1);
	l2.add(105);
	l2.add(2054);
	l2.add(3045);
	l2.add(105);
	l2.add(205);
	l1.add(10);
	l1.add(20);
	l1.add(30);
	l1.add(10);
	l1.add(20);

	System.out.println(l2);
	Collections.copy(l1, l2);
	System.out.println(l1);
	
	System.out.println("**************************");
	
	for(Integer i:l1)
	{
		System.out.println(i);
	}
	/*
	ListIterator<Integer> lr= l2.listIterator();
	lr.add(500);
	lr.add(200);
	while(lr.hasNext())
	{
	System.out.println(lr.next());
	}*/
	
	
	
	
	}

}
