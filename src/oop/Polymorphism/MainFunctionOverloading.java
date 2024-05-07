package oop.Polymorphism;

public class MainFunctionOverloading {

	//Main() overloading is possible but overriding is not possible
	//directly by JVM
	public static void main(String[] args)
	{
		System.out.println("Main() function is calling with string arguments");

	}
	public static void main(int[] args) {
		System.out.println("Main() function is calling with int arguments");

	}

}
