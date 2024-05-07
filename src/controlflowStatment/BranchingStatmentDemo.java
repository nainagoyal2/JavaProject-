package controlflowStatment;

public class BranchingStatmentDemo {
	public static String test()
	{
		
		return "Branching statment Completed ";
	} 
 
	public static void main(String[] args) {
		
		
		
		//break -exit loop	and switch body
		
		
		for(int i=1;i<=10;i++)
		{
			if (i>5)
			{
				break;	
			}
			 
			else 
			{	
				System.out.println(i);//1,2,3,4	
			}	
		}
		
		System.out.println("done");
		
		System.out.println("**********************");
		//conytinue -skip the part of code and continue with next itration
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			else
				System.out.println(i);
			
			
		}
		
		
		System.out.println("**********************");
		String res=test();
		System.out.println(test());
		
	}
	
}
