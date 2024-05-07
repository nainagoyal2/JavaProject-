package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignmet {
 
	public static void main(String[] args) {
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(100);
		a2.add(10);
		a2.add(5);
		a2.add(19);
		a2.add(50);
		a2.add(80);;
		System.out.println(a2.size());
		
		System.out.println("Print the max element is: "+Collections.max(a2));
		System.out.println("Print the min element is: "+Collections.min(a2));
		Collections.sort(a2);
		
		ArrayList<Integer> a3= new ArrayList<Integer>();
		a3.addAll(a2);
		System.out.println("Sort the element: "+a3);
      
	}

}
