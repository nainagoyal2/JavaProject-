package Assignment;

public class PatternAssignment {
	
	public static void main(String args[])
	{
		System.out.println("patten1");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		System.out.println("patten2");
		
	      for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i +" ");
				}
				System.out.println();
			}
		
			System.out.println("***Patern3****");
			int k=1;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(k +" ");
					k++;
				}
				System.out.println();
				
			}
			
			
			System.out.println("*****patern4*********");
			for(int i=1;i<=10;i++)
				
			{
				if (i<=4)
				{
					System.out.println(i);
					
				}
				else
				{
					System.out.print(i);
				}
				
			}
			
			
				
				
				
			

			
				
		
			
			
		
	}

}
