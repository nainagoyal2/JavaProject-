package collectionFramework;
 
import java.util.Vector;

public class VectorDemo {
	
	
	/* Vector is class implement list interface
	 * Under line data structure is Dynamic array
	 * Vector is syncronized  	(at a time one process)
	 * performance wise it is slow 
	 * 
	 * 
	 * */
	
	
      public static void main(String args[])
 {
	 Vector<Integer> v1 = new  Vector<Integer>();
	System.out.println("Vector intial is empty: " +v1.isEmpty());
	if(v1.isEmpty())
	{
		v1.add(10);
		v1.add(20);
		v1.add(30);
		v1.add(10);
		v1.add(20);
		v1.add(null);
		
	}
	System.out.println("Vector after is empty: " +v1.isEmpty());
	
	System.out.println("Total element: "+v1.size());
	System.out.println("is vector 10 is available: "+v1.contains(10));
	System.out.println("is vector 10 is available: "+v1.contains(40));
	System.out.println(v1);
	//remove
	v1.remove(2);
	System.out.println(v1);
	v1.add(2, 30);
	
	
	//iteration
	System.out.println(v1);
	for(Integer i:v1)
	{
		System.out.println(i);
	}	
	 
 }

}
