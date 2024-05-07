package arrayDemo;

public class MultiDArray {

	public static void main(String[] args) {
		// using new keyword
		int id[][]= new int[2][2];
		id[0][0]=101;
		id[0][1]=102;
		id[1][0]=103;
		id[1][1]=104;
		System.out.println("Number of rows is: "+id.length);//2
		//row>colum>value
		System.out.println("Number of column is: "+id[0].length);//2
		System.out.println("Single data is : "+id[1][0]);//103
	//	java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
		//at arrayDemo.MultiDArray.main(MultiDArray.java:16)
	//	System.out.println("Single data is : "+id[2][0]);//AIOBE
		
		
		System.out.println("*******Nested Loop*******");
		for(int i=0;i<id.length;i++)
		{
			for(int j=0;j<id[i].length;j++)
			{
				System.out.print(id[i][j] +"  ");
			}
 			System.out.println();
		}
		System.out.println("*******For EACH Nested Loop*******");
		
		for(int i[]:id)
		{
			for(int j:i)
			{
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("*******Literal way array*******");
		double marks[][] = {{15.22,22.23},{25.22,32.23},{55.22,32.23},{75.22,52.23}};
		System.out.println("row " +marks.length);
		System.out.println("column " +marks[0].length);
		 
		System.out.println("Marks data is : "+marks[1][0]);
		for(int r=0;r<marks.length;r++)
		{
			for(int c=0;c<marks[r].length;c++)
			{
				System.out.print(marks[r][c]+" ");
				
			}
			System.out.println();
		}
		
	}

}
