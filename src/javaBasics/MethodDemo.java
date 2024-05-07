package javaBasics;

public class MethodDemo {
	
	/*Two type of method available in java
	 * Instance (): 
	 * To call Instance method we need object
	 * Method define without static keyword
	 * Static(): 
	 * To call static We do not need any object
	 * Method with static keyword is static method
	 * static method we can call within class without class name 
	 * static method we can call in other call using class name
	 * \
	 */
	public void accept()
	{
		System.out.println("This is instance method");
		
	}
	
	public static void show()
	{
		System.out.println("This is static method");
	}
	
	
	public static void main(String args[])
{
		MethodDemo d1 = new MethodDemo();
		d1.accept();
		MethodDemo.show();
		show();
		
		
		
	}

}
