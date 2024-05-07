package com.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(100);
	a1.add(200);
	a1.add(400);
	a1.add(500);
	a1.add(100);
	a1.add(200);
	System.out.println(a1);
	
	Set<Integer> h1 =new HashSet<Integer>(a1);
	System.out.println(h1);
	
	LinkedHashSet<Integer> h2 =new LinkedHashSet<Integer>(a1);
	System.out.println(h2);
	ArrayList<Integer> a2 = new ArrayList<Integer>();
	for(int i=0;i<a1.size();i++) {
		if(a2.contains(a1.get(i))) {
			
	}
		else {
			a2.add(a1.get(i));
		}
	}
	
	System.out.println(a2);
	}

}
