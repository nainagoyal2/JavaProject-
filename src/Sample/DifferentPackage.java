package Sample;

import oop.Inheritance.AccessModifier;

public class DifferentPackage extends AccessModifier{
	
	public static void main(String[] args) {
		
		
		
		 AccessModifier a1 = new AccessModifier();
	     System.out.println(a1.name);
	     DifferentPackage d1 =new DifferentPackage();
	     System.out.println(d1.acc_bno);
	     System.out.println(d1.name);
	     
	}

}
