package oop.Polymorphism;

public class CompiletimeoperatorPoly {
	
	public void add(String a1 , String a2)
	{
		System.out.println(a1.concat(" "+a2));
		System.out.println(a1+" "+a2);
	}
	public void add(int a1 ,int a2)
	{
		System.out.println((a1+a2));
	}
	
public static void main(String args[])
{
	CompiletimeoperatorPoly c1 = new CompiletimeoperatorPoly();
	
	c1.add("naina", "goyal");
	c1.add(10,12);
	
	}

}
