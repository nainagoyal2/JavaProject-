package oop.Inheritance;
class C{
	
	
	public void m1()
	{
		System.out.println("m1() is calling");
		
	}
}

//C is parent and D is Child //SINGLE
class D extends C{

	
	public void m2()
	{
		System.out.println("m2() is calling");
		
	}
}
//D is parent and E is Child
class E extends D{
	
	
	public void m3()
	{
		System.out.println("m3() is calling");
		
	}
}



public class Multilevel {
	
	public static void main(String[] args) {
		
		System.out.println("Scenario1:  child class ref and child class object: child +parent property");
	     E e1=new E();
	     e1.m3();//individual
	     e1.m2();//inherited
	     e1.m1();//inherited
	     
	     
	     
		System.out.println("Scenario2:  parent class ref and parent class object:only parent property");
       
		D d1= new D();
		d1.m1();//inherited
		d1.m2();//individual
		
        System.out.println("Scenario3:  parent class ref and child class object:only parent property");
        D  d2 =new E();
        d2.m1();//inherited
        d2.m2(); //individual 
        System.out.println("Scenario4:  child class ref and parent class object:invalid");
        //as java always do top casting
     //  B b2=new A();//Type mismatch: cannot convert from A to B
	}
	

}
