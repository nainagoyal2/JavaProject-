package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;




public class ArrayListScenario {

	public static void main(String[] args) {
		
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(200);
		a1.add(180);
		a1.add(10); 
		a1.add(500);
		a1.add(90);
		a1.add(21);
		a1.add(30);
		System.out.println(a1);
         Integer sum=0;
         for(int i=0; i<a1.size(); i++)
         {
        	 sum =sum+a1.get(i);
         }
		System.out.println(sum);
		
		
		/*
		 * Collection is interface
		 * Collections class which has static methods
		 * 
		 */
		
		
		
         Collections.sort(a1);
        System.out.println(a1);
		System.out.println("********************");
         
         //addAll():Appends all of the elements in the specified collection 
         ArrayList<Integer> result= new ArrayList<Integer>();
         result.addAll(a1);
         System.out.println(result);
         
         
         //to reverse
         Collections.reverse(result);
         System.out.println(result);
         
         
	
		
	}

}
