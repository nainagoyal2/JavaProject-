package oop.DataAbstraction;

public abstract  class RBIBank {
	
	/*
	 * Implemented method +  Abstract method(method without any  body)
	 * abstract method need to implented by its child
	 * for abstract class we can't create object
	 * */
	
	RBIBank(){}
	
	//fully Implemented
	public void deposit()
	{
		System.out.println("RBI.......fully Implemented .......Deposit()");
		
	}
	
	
	public void withdrow()
	{
		System.out.println("RBI......fully Implemented ........withdrow()");
		
	}
	//Abstract method
	public abstract  void ratofInterset();
	public static void main(String args[])
	{
		//Cannot instantiate the type RBIBank
	//	RBIBank r1 = new RBIBank();
	}
	

}
