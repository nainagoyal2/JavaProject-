package com.practice;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {

		String s2 = "daksh123#@%naina";
		String s3 = "";
		for (int i = 0; i < s2.length(); i++) {

			if (Character.isAlphabetic(s2.charAt(i)))

			{
				s3 = s3 + s2.charAt(i);

			}

		}
		System.out.println(s3);
		System.out.println(s3.length());
		
		
System.out.println("************");
		String s1 = "GeeGGksfokseropprGeeks";
        Map<Character,Integer>map=new HashMap<>();
        
		for (int i = 0; i < s1.length(); i++) {
		
			if(map.get(s1.charAt(i))==null) {
				map.put(s1.charAt(i), 1);
			}
			
			else {
				map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
			}
			

		}
		
		
			System.out.println(map.toString());
	}
}

