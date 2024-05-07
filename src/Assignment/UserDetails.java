package Assignment;

import java.util.Scanner;
//Collections
//UserDetails
public class UserDetails {
	public void personaldetalis(String First_name, String Last_name, String Email_id, 
		char Gender,long Phone_No, int postal_code)
	{
		System.out.println("Print the First_name:" +First_name);
		System.out.println("Print the Last_name:" + Last_name);
		System.out.println("Print the Email_id:" +Email_id);
		System.out.println("Print the Gender(M/F):" +Gender);
		System.out.println("Print the Phone_No:" +Phone_No);
		System.out.println("Print the postal_code:" +postal_code);
	}
	 
	public static void main(String args[])
	{
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter the First_name:");
		String f_name= s1.nextLine();
		System.out.println("Enter the Last_name:");
		String l_name= s1.nextLine(); 
		System.out.println("Enter the Email_id:");
		String e_name= s1.nextLine();
		System.out.println("Enter the Gender:");
		char g_name= s1.nextLine().charAt(0);
		System.out.println("Enter the Phone_number:");
		long p_no=s1.nextLong();
		System.out.println("Enter the postal_code:");
		int postal_code=s1.nextInt();
		UserDetails u1= new UserDetails();
		u1.personaldetalis(f_name, l_name, e_name, g_name, p_no, postal_code);
		s1.close();
		
		
		
	}

}
