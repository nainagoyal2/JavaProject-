package Assignment;

public class BankDemoTestEncapsulation {
	public static void main(String args[]) 
	{
		BankDemoEncapsulation b1 =new BankDemoEncapsulation();
		b1.setAcc_No(11323333348490L);
		b1.setBalance(2000);
		System.out.println(b1.getAcc_No());
		System.out.println(b1.getBalance());
	}

}
