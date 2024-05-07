package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayStringList {

	public static void main(String[] args) {
		System.out.println("*******List 1***************");

		ArrayList<String> as2 = new ArrayList<String>();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter the string");
		for (int i = 0; i <= 2; i++) {
			String s3 = sc1.nextLine();
			as2.add(s3);
		}

		System.out.println(as2);

		System.out.println("*******List 2***************");
		ArrayList<String> as1 = new ArrayList<String>();

		Scanner sc5 = new Scanner(System.in);
		System.out.println("enter the string");
		for (int i = 0; i <= 2; i++) {
			String s2 = sc5.nextLine();
			as1.add(s2);
		}
		System.out.println(as1);

		System.out.println("*******Merger Both list***************");
		as2.addAll(as1);
		System.out.println(as2);

		sc1.close();
		sc5.close();

		System.out.println("*******using  list method***************");
		
		
		
		
		  List<String> l1 = Arrays.asList("pooja", "akash" , "usha"); 
		  List<String> l2=Arrays.asList("ashu","mamta","uma");
		  ArrayList<List<String>> a3 = new ArrayList<List<String>>(); 
		  a3.add(l1); 
		  a3.add(l2); 
		  System.out.println(a3);
			System.out.println("*******different type list print**************");
			
			ArrayList<String> a4 =new ArrayList<String>();
			a4.addAll(l1);
			a4.addAll(l2);
			System.out.println(a4);

	}

}
