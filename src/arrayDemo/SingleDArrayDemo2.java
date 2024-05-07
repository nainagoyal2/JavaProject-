package arrayDemo;

public class SingleDArrayDemo2 {
	public static void main(String args[])
	{
		//String loc[]= new String[5];
		
		String loca[]= {"Pune", "Mumbai","Nagpur", "Satara"};
		System.out.println("Total Location is: "+loca.length);
		System.out.println("For each loop");
		for(String s: loca )
		{
			System.out.println(s);
		}
		System.out.println("******************");
		System.out.println("Simple For loop"); 
		for(int i=0; i<loca.length;i++ )
		{
			System.out.println(loca[i]);
		}
		
		System.out.println("******************");
		
		int num[]= {10,20,30,40,50};
		//sum of all the numbers in array
		
		int sum=0;
		/*
		 * for(int i:num) { sum=sum+i;
		 * 
		 * }
		 */
		System.out.println("******************");
		System.out.println("For loop");
		for(int i=0; i<num.length; i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum); 
		
		
		System.out.println("******************");
		double marks[]= {40.5,90.45,43.44}; 
		System.out.println("Marks length is:" +marks.length);
		for(double i:marks)
		{
			
			if(i>80.0)
			{
			System.out.println(i);
			}
		
		}

		System.out.println("******************");
		
		//In java  Object is super class
		//Everonce data is in object store as  a object
		
		//Real data
		Object empdata[] = {"Sarang", "Pune",'M',40,9343434334L,98.77};
		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
	}
	

	
	

}
