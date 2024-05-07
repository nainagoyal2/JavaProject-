package com.practice;

public class ReverseString {
	public static boolean checkPallindrome(String s) {
		String rev ="";
		for(int i=s.length()-1;i>=0;i--)
		{
		rev = rev+(s.charAt(i));
		}
		
		if(rev.equals(s))
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		String s1 = "naina"; //ANIAN
		String sum = "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
		//s1.charAt(i)	
			
			sum =sum+(s1.charAt(i));
			
		}
		System.out.println(sum);
		String s2="Goyal";
		StringBuilder br = new StringBuilder(s2);
		
		System.out.println(br.reverse());
		
		
		
		System.out.println("*********palindrom*********************");
        if(checkPallindrome("madams")) {
        	System.out.println("Pallindrome");
        }
        else
        {
        	System.out.println("not Pallindrome");
        }

}
}
