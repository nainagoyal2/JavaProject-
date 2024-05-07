package oop.Inheritance;

public class ChildRunTimePoly extends ParentRunTimePoly {
	@Override
	public void color()
	{
		System.out.println("yellow");
	}

	public static void main(String[] args) {
	
		//child class refer and child class object
		 ChildRunTimePoly c1 = new  ChildRunTimePoly();
		 c1.color(); //yellow
		 
		 //parent ref and parent object
		 
		 ParentRunTimePoly p1 =new ParentRunTimePoly();
		 p1.color();
		 
		//parent ref and child object
		 ParentRunTimePoly p2 = new  ChildRunTimePoly();
		 p2.color();
	}

}
