package stringDemo;

public class StringBuilderClassDemo {
	
	public static void main(String []args)
	{
		/*How to reverse string with method
		 *StringBuffer(thread safe) and StringBuilder(not thread safe) are mutable classes in java
		 * */
		

		StringBuilder br=new StringBuilder("Java");
		System.out.println(br);
		br.append(17);
		System.out.println(br);
		System.out.println(br.reverse());
		
		
		
		
		
	}


}
