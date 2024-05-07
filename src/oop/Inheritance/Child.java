package oop.Inheritance;

public class Child extends Parent{
	int cid=101;
	public void  childIncome()
	{
		System.out.println("parent id is: "+super.pid);
		super.parentIncome();
		System.out.println("child id is : "+cid);
		System.out.println("child income is :209000");
	}
	public Child()
	{
		super();
		System.out.println("child CONSTRUCTOR");
	}
	public static void main(String args[])
	{
		Child c1=new Child();
		c1.childIncome();
	}

}
