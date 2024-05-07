package Assignment;

public class PaymentPolymorphism {
  
	public void makePayment(String pay_mode, int card_number, int cvv, int otp)
	{
		
		System.out.println("Payment with Credit card: "+pay_mode);
		System.out.println("Enter the Credit card no: "+card_number);
		System.out.println("Enter the cvv: "+cvv);
		System.out.println("Enter the otp: "+otp);
    }

	public void makePayment(String pay_mode, long card_number, int cvv, int otp)
	{
		System.out.println("Payment with debit card: "+pay_mode);
		System.out.println("Enter the debit card no: "+card_number);
		System.out.println("Enter the cvv: "+cvv);
		System.out.println("Enter the otp: "+otp);
		
    }
	public void makePayment(String pay_mode, String upi,int otp)
	{
		System.out.println("Payment with upi: "+pay_mode);
		System.out.println("Enter the upi: "+upi);
		System.out.println("Enter the otp: "+otp);
    }
	
	public void makePayment(String pay_mode, String user_name, String password,int otp)
	{
	System.out.println("Payment with netbanking: "+pay_mode);
	System.out.println("Enter the UserName: "+user_name);
	System.out.println("Enter the Password: "+password);
	System.out.println("Enter the otp: "+otp);
		
    }
	public void makePayment(String pay_mode)
	{
		System.out.println("Payment with COD: "+pay_mode);
    }
	public void makePayment(String pay_mode, int pay_balance,int otp)
	{	
	System.out.println("Payment with Amazonpay: "+pay_mode);
	System.out.println("Enter the Pay balance: "+pay_balance);
	System.out.println("Enter the otp: "+otp);
		
		
    }
	


}
