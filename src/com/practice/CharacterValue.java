package com.practice;

public class CharacterValue {
    //daksh123#@%naina
	public static void main(String[] args) {

	     String s1=	"daksh123#@%naina";
	     String s2 = "";
	    
	     
	     
	 for(int i=0;i<s1.length();i++) 
	{
		char c=s1.charAt(i);
	      if(c>='a'&& c<='z')
	    {
	    	  s2=s2+c+"";
	    }
	}
	 
     
 for(int i=0;i<s1.length();i++) 
{
	
      if(Character.isLetter(s1.charAt(i)))
    {
    	  s2=s2+s1.charAt(i)+"";
    }
}
	 System.out.println(s2);

	}}