package controlflowStatment;

import java.util.Scanner;

public class LadderIfDemo2 {
	
	
	public static void main(String[] args) {
		 // for character accept data as String and use method charAt(index)
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Character");
	    char vowel=sc.nextLine().charAt(0);
	    if(vowel=='a'||vowel=='e'||vowel=='i'||vowel=='o'||vowel=='u')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else	
	    {
	    	System.out.println(vowel+" is constant!");
	    }
	    
	  /*  if (vowel=='a')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else if (vowel=='e')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else if (vowel=='i')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else if (vowel=='o')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else if (vowel=='u')
	    {
	    	System.out.println(vowel+" is vowel!");
	    }
	    else	
	    {
	    	System.out.println(vowel+" is constant!");
	    }*/
		sc.close();
	}

}
