package oop.Inheritance;


final class Demo 
{
final int id =101;

public final void color()
{
	
System.out.println("Blue");
}

public static void main(String args[])
{
	
	
	Demo d1 = new Demo();
	
	d1.color();

	
}


}



//The type FinalKeywordDemo cannot subclass the final class Demo
//public class FinalKeywordDemo  extends Demo{
	//@Override
/*	public void color()//cannot override the final method from Demo
	{
		
	System.out.println("Black");
	}*/
	
	
	
		//FinalKeywordDemo f1 = new FinalKeywordDemo();
//	f1.id=201; //The final field Demo.id cannot be assigned
		//System.out.println(f1.id);
	//	f1.color();


