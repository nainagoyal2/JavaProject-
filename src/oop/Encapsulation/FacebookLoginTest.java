package oop.Encapsulation;

public class FacebookLoginTest {
	public static void main(String srgs[])
	{
		
		LoginPage user1= new LoginPage();
		user1.setUsername("NAINA");
		user1.setPassword("test@123");
		user1.clickLogin(user1.getUsername(), user1.getPassword());
		
		 
		LoginPage user2= new LoginPage();
		user2.setUsername("NEHA");
		user2.setPassword("testT@123");
		user2.clickLogin(user2.getUsername(), user2.getPassword());
		
	}

}
