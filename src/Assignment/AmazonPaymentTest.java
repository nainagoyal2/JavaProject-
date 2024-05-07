package Assignment;

public class AmazonPaymentTest {
	public static void main(String args[])
	{
		PaymentPolymorphism p1 = new PaymentPolymorphism();
		p1.makePayment("HDFC Card", 324893, 434, 4344);
		p1.makePayment("ICICI Card", 3284823432L, 3240, 0424);
		p1.makePayment("Phone_pay", "naina@icici.com", 2332);
		p1.makePayment("Netbanking", "naina@123", "punet@123", 3230);
		p1.makePayment("COD");
		p1.makePayment("Amazon pay", 12000, 1220);
				
				
		
		
	}

}
