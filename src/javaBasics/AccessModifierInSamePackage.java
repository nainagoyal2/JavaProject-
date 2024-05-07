package javaBasics;

public class AccessModifierInSamePackage {
	
	
	public static void main(String args[])
	{
		//same package different class
		AccessModifier a1= new AccessModifier();
				
		
		System.out.println("default: " +a1.id);
		System.out.println("public: " +a1.name);
		System.out.println();
	
		
	}

}
