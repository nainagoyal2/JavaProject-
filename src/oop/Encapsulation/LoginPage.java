package oop.Encapsulation;

public class LoginPage {
	private String username;
	private String password;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
	public void clickLogin(String un,String psw)
	{
		System.out.println("hello Welcome " +un);
		
		
	}

}
