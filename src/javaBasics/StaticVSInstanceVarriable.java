 package javaBasics;

public class StaticVSInstanceVarriable {

	int count =1; //instance variable get the new memory for every object 
	static int a=1; //one time memory will create
	
	StaticVSInstanceVarriable()
	{
		
		//instance variable calling
	    //System.out.println(count);
		//count++;
		
		//static varriable calling
		System.out.println(a);
		a++; 
	}
	
	public static void main(String[] args) {
		StaticVSInstanceVarriable s1 = new StaticVSInstanceVarriable();
		StaticVSInstanceVarriable s2 = new StaticVSInstanceVarriable();
		StaticVSInstanceVarriable s3 = new StaticVSInstanceVarriable();
		StaticVSInstanceVarriable s4 = new StaticVSInstanceVarriable();
		StaticVSInstanceVarriable s5 = new StaticVSInstanceVarriable();
	}

}
