package oop.Polymorphism;

public class AmazonSearch {
	public void search(String pname)
	{
		System.out.println("Product search by pname: " +pname);
		
	}
	public void search(int price)
	{
		System.out.println("Product search by price: " +price);
		
	}
	public void search(String pname,int price)
	{
		System.out.println("Product search by name : " +pname+ " & price: " +price);
		
	}
	public void search(String pname,String bname)
	{
		System.out.println("Product search by pname: " +pname+ "& bname:  " +bname);
		
	}
	
	public void search(int price, String pname)
	{
		System.out.println("Product search by price:  " +price+ " & pname: " +pname);
		
	}
	

}
