 package controlflowStatment;

import java.util.Scanner;

public class SwitchCaseDemo {
	
	
	public static void main(String[] args) {
		 // for character accept data as String and use method charAt(index)
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Character");
	    char ch=sc.nextLine().charAt(0);
	    
	    switch (ch) {
		case 'a': 
			System.out.println(ch+ " is a vowel!");
			break;
		case 'e': 
			System.out.println(ch+ " is a vowel!");
			break;
		case 'i': 
			System.out.println(ch+ " is a vowel!");
			break;
		case 'o': 
			System.out.println(ch+ " is a vowel!");
		    break;
		case 'u': 
			System.out.println(ch+ " is a vowel!");
			break;

		default:
			System.out.println(ch+ " is not a vowel!");
		sc.close();
		}
	    
	}

}
