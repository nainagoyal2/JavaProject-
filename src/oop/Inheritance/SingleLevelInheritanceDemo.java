package oop.Inheritance;


	//SINGLE LEVEL
	class A{
	
		
		public void m1()
		{
			System.out.println("m1() is calling");
			
		}
	}
	
	//A is parent and B is Child
class B extends A{
	
		
		public void m2()
		{
			System.out.println("m2() is calling");
			
		}
	}
public class SingleLevelInheritanceDemo {
	

	public static void main(String[] args) {
		
		System.out.println("Scenario1:  child class ref and child class object: child +parent property");
		B b1= new B();
		b1.m1(); //inherited
		b1.m2(); //individual
		System.out.println("Scenario2:  parent class ref and parent class object:only parent property");
        A a1= new A();
        a1.m1();//individual
        System.out.println("Scenario3:  parent class ref and child class object:only parent property");
        A a2 =new B();
        a2.m1();//individual
        System.out.println("Scenario4:  child class ref and parent class object:invalid");
        //as java always do top casting
     //  B b2=new A();//Type mismatch: cannot convert from A to B
        
	}

}
