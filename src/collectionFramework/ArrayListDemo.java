package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListDemo {
	/*Arraylist is class implement List interface
	 * Underline Data structure is Dynamic Array
	 * ArrayList is order collection
	 * it is allow duplication
	 * internally arraylist create 10 virtual segement
	 * method()
	 * add(),clear(), isEmpty(),contains();addAll,size();
	 * 
	 * Arraylist is best choice for retrive element for list
	 * 
	 * */
public static void main(String args[])
{
	//generic decalartion only 1 type of object
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	//List<Integer> a1 = new ArrayList<Integer>();
	System.out.println("Is my list is Empty intial?:" +a1.isEmpty());//true
	a1.add(10);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(20);
	a1.add(50);
	
	System.out.println("Is my list is Empty after adding?:" +a1.isEmpty());
	System.out.println("Total Element in list:" +a1.size());
	System.out.println(a1);
	
	
	System.out.println("Is list contains 100 "+a1.contains(100));
	System.out.println("Is list contains 10 "+a1.contains(10));
	
	//Remove object
	a1.remove(2);
	System.out.println(a1);
	a1.add(2, 30);
	System.out.println(a1);
	
	a1.clear();
	System.out.println("AFTER clear");
	System.out.println(a1); //[]
	System.out.println(a1.size());// intger value deafult 0
	
	System.out.println("*************");
	
	ArrayList<String> loc = new ArrayList<String>();
	loc.add("Satara");
	loc.add("Pune");
	loc.add("Mumbai");
	System.out.println("Total Location: "+loc.size());
	System.out.println(loc);
	
	
	System.out.println("*************");
	ArrayList<Double> a2 = new ArrayList<Double>();
	a2.add(10.3);
	a2.add(20.5);
	a2.add(30.7);
	a2.add(40.8);
	System.out.println("Total Score: "+a2.size());
	System.out.println(a2);
	System.out.println("*************");
	
	ArrayList<Object> empData = new ArrayList<Object>();
	empData.add("Naina");
	empData.add(18);
	empData.add("Pune");
	empData.add('F');
	empData.add(1222);  
	System.out.println(empData);
	
	System.out.println("*******Iterator loop***********");
	Iterator<Object> em1= empData.iterator();
	while(em1.hasNext())
	
	{
		System.out.println(em1.next());
	}
	
	
	
	
	System.out.println("*******for each loop***********");
	
	for(Object i:empData)
	{
		System.out.println(i);
		
	}



	
	
	   
	
	
	
	}
}
