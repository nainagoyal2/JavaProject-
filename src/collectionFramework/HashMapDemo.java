package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	/*Hashmap  class implement Map
	 * Underline(Based on) data structure is hashtable
	 * <key:value>
	 * Entry is interface is map
	 * as per hashing mechansim map sores value into hash table
	 * total 16 virtual segment  is create
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		HashMap<String, Integer> h1 = new HashMap<String, Integer> ();
		h1.put("lohegaon",33720);
		h1.put("whagoli",324234);
		h1.put("viman",23432);
		h1.put("marathali road",324234);
		
		
		System.out.println("is map is empty" +h1.isEmpty());
		System.out.println("Total element" +h1.size());
		
		System.out.println("Single info: " +h1.get("viman"));
		System.out.println(h1);
		System.out.println("is h1 contains key: whagoli: "+h1.containsKey("whagoli"));
		System.out.println("is h1 contains key: Whagoli: "+h1.containsKey("Whagoli"));
		System.out.println("is h1 contains value: 324234: "+h1.containsValue(3432343));
		System.out.println("is h1 contains key: marathali road: "+h1.containsKey("marathali road"));
		
		
		System.out.println("***********ITERATion in map****************");
		
		
		for(Map.Entry<String, Integer> i:h1.entrySet())
		{
		//	System.out.println(i);
			
			System.out.println(i.getKey()+ ":"  +i.getValue());
			System.out.println("***************************");
			/*How to iterate map using iterator()
			 * covert your map into any collection
			 * entrySet(): Set<Entry<String,Integer>>
			 * 
			 * 
			 * */
			
			
		Set<Entry<String,Integer>> set1=h1.entrySet();
        Iterator<Entry<String,Integer>> ir=set1.iterator();
        while(ir.hasNext())
        {
        	System.out.println(ir.next());
        }
			
			
		}
	
	}

}
