package controlflowStatment;

public class NestedForLoop {
	public static void main(String args[])
	{
		
		//row
		for(int num=1;num<=10;num++)
		{
			
			//coumn 
			for(int i =1;i<=10;i++)
			{
				System.out.print(num*i +"\t");
				
			}
			System.out.println();
		}
		
		
		System.out.println("*******************");
		
		for(int i=1;i<=4;i++)
		{
			
			//coumn 
			for(int j=1;j<=4;j++)
			{
				System.out.print("*"+"  ");
				
			}
			System.out.println();//next row
		}
		System.out.println("*******************");
		for(int i=1;i<=4;i++)
		{
			
			//coumn 
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+"  ");
				
			}
			System.out.println();//next row
		}
		
		
	}

}
