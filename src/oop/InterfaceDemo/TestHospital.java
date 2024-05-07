package oop.InterfaceDemo;

public class TestHospital {
	public static void main(String args[])
	{
		
		//child object & ref
		NobleHS n1= new NobleHS();
		n1.cardio();
		n1.physio();
		n1.medical();
		n1.nero();
		n1.dental();
		n1.covid19Test();
		
		System.out.println("********************");
		//child object & parent ref
		IMA i1 =  new NobleHS();
		i1.cardio();
		i1.physio();
		i1.covid19Test();
		System.out.println("********************");
		//child object & parent ref
		USMA u1 = new NobleHS();
		u1.dental();
		u1.nero();
		u1.covid19Test();
	
	}

}
