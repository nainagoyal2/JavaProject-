package oop.Inheritance;

public class AccessModifier {
	int id =101;
	public  String name="Amit";
	private long phone_no=32393933L;
	protected int acc_bno=3298432;
	 
	 public static void main(String args[])
	{
		 AccessModifier a1 = new AccessModifier();
		 System.out.println(a1.id);
		 System.out.println(a1.name);
		 System.out.println(a1.phone_no);
		 System.out.println(a1.acc_bno);
		 
		
	}

}
