package oop.DataAbstraction;


//The type HDFC must implement the inherited abstract method RBIBank.ratofInterset()
public class HDFC extends RBIBank {
	
	//Individual
	public void custDetails()
	{
		System.out.println("HDFC .......custDetails()");
		
	}
    //inherited abstract method
	@Override
	public void ratofInterset() {
		
		System.out.println("HDFC.......RateofInterst() .......8%");
		
	}

	public static void main  (String args[])
	{
		
		System.out.println("Sceansrio 1:child ref and child object ");
	
		HDFC h1 = new HDFC();
		h1.custDetails();//individual
		h1.deposit();//inherited
		h1.withdrow();//inherited
		h1.ratofInterset();//inherited abstract method
				
		System.out.println("Invalid :Sceansrio 2:paren ref and parent object ");
		//RBIBank r1 = new RBIBank();		//Cannot instantiate the type RBIBank
		System.out.println("Sceansrio 3:parent ref and child object "); 
		RBIBank r1 = new HDFC();
		r1.deposit();
		r1.withdrow();
		r1.ratofInterset();
	}
}
