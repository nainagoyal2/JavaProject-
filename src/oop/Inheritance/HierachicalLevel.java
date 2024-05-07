package oop.Inheritance;

class F{
	
	
	public void m1()
	{
		System.out.println("m1() is calling");
		
	}
}

//F is parent and G is Child //SINGLE
class G extends F{

	
	public void m2()
	{
		System.out.println("m2() is calling");
		
	}
}
//F is parent and H is Child HierachicalLevel
class H extends F{
	
	
	public void m3()
	{
		System.out.println("m3() is calling");
		
	}
}




public class HierachicalLevel {
	
	public static void main(String[] args) {
		
		System.out.println("Scenario1:  child class ref and child class object: child +parent property");
	     
	     H h1 = new H();
	     h1.m1();
	     h1.m3();
	     
	     G g1 = new G();
	     g1.m1();
	     g1.m2();
	     
	     
		System.out.println("Scenario2:  parent class ref and parent class object:only parent property");
       
		F d1= new F();
		d1.m1();//inherited
		
		
        System.out.println("Scenario3:  parent class ref and child class object:only parent property");
        F d2 =new H ();
        d2.m1();
        
        System.out.println("Scenario4:  child class ref and parent class object:invalid");
        //as java always do top casting
     //  B b2=new A();//Type mismatch: cannot convert from A to B
	}

}
