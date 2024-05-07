package Assignment;

public class MultiArrayAssignment {
	public static void main(String args[]) 
	{
		Object empData[][]= { {"User_Name", "Password"},{"Naina", "naia@123"},{"Ashish","naina@123"},{"Gurav" ,"naa@123"},
				{"Daksh", 35357},{"Puneet", 347559}};
		System.out.println("lenght of row is: "+empData.length);
		System.out.println("lenght of column is: "+empData[0].length);
		
		
		System.out.println("*******Nested Loop*******");
		for(int i=0;i<empData.length;i++) 
		{
			for(int j=0;j<empData[0].length;j++)
				
			{
				
				System.out.print(empData[i][j] +"  ");
			}
 			System.out.println();
			
		}
		System.out.println("*******Without Heading*******");
		for(int i=1;i<empData.length;i++) 
		{
			for(int j=0;j<empData[1].length;j++)
				
			{
				
				System.out.print(empData[i][j] +"  ");
			}
 			System.out.println();
			
		}
		
		
		
		
		System.out.println("*******For each Nested Loop*******");
		for(Object r[]: empData)
		{
			for(Object c:r)
			{
				System.out.print(c +"  ");
			}
 			System.out.println();
			}
			
		
		
		}
		
		
		
	}


