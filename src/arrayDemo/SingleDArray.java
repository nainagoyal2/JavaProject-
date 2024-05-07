package arrayDemo;

public class SingleDArray {

	public static void main(String[] args) {
		// Using new Keyword way
		//declaration
		int sid[] = new int[5];
		 //intialize array
		sid [0]=101;
		sid [1]=102;
		sid [2]=103;
		sid [3]=104;
		sid [4]=105;
		//to calculate length of array use length variable  
		//array doest not supportany method
		System.out.println("Length of array is:"  +sid.length);
		
		//single data 
		System.out.println(sid[3]);
		
		System.out.println(sid[2]);  //0
		//java.lang.ArrayIndexOutOfBoundsException: index 5 out of bounds for length 5
		//at arrayDemo.SingleDArray.main(SingleDArray.java:24)
		//System.out.println(sid[5]);
		
		
		System.out.println("Print all the element together");
		for (int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
			
		}
		
		System.out.println("for each loop");
		for(int i:sid)
		{
			System.out.println(i);
		}
		System.out.println("********************");
		
		//Using Literal way(Constant data)
		int id[]= {10,20,30,40};
		System.out.println("size of array is: "+id.length);
		System.out.println(id[2]);//30
		//System.out.println(id[5]);
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("for each loop");
		for(int i:id)
		{
			System.out.println(i);
		}
		
		
		
		 
		
	}

}
