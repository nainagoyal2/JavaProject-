package javaBasics;

public class OperatorDemo {
	public static void main(String args[])
	{
		
		
		System.out.println("*****Arithmatic Operations*********");
		//Arithmetic +,-,*,\,%
		int a=20,	 b=10;
		System.out.println("Addition is: "+(a+b));
	
		System.out.println("Substraction is:"+(a-b));
		System.out.println("Division is:"+(a/b));
		System.out.println("Multiplication is:"+(a*b));
		System.out.println("Modulus is:"+(a%b));
		
		System.out.println("*****Unary Operations*********");
		
		
		
		/*Unary operations  ++,--
		 * 
		 * Increment operator(++) post increment     Pre increment
		 *                            a++              ++a
		 * 
		 * decrement opertor          a--               --a
		 * */
		
		
		
		System.out.println("*****Pre increment*********");
		int a1=100;
		System.out.println(a1);//100
		System.out.println(++a1);//101
		
		System.out.println("*****Post Inecrement*********");
		
		
		int b1=200;
		System.out.println(b1);//200
		System.out.println(b1++);//200
		System.out.println(b1);//201
		
		
		System.out.println("*****Pre Decrement*********");
		
		int c1=100;
		System.out.println(c1);//100
		System.out.println(--a1);//99
		
		
		System.out.println("*****Post Decrement*********");
		
		int d1=200;
		System.out.println(d1);//200
		System.out.println(d1--);//200
		System.out.println(d1);//199
		
		System.out.println("*****Interview Scenario*********");
		//Increment
		int a2=85;
		int b2=a2++;
		System.out.println(b2);//85
		System.out.println(a2);//86
		
		
		
		int p=589;
		int q=p++;
		System.out.println(q);//589
		System.out.println(p);//590
		
		
		int i=478;
		int j=++i;
		System.out.println(i);//479
		System.out.println(j);//479
		
		
		int u=90;
		int v=++u;
		System.out.println(u);//91
		System.out.println(v);//91
		
		//decrement
		int s=69;
		int r=s--;
		System.out.println(s);//68
		System.out.println(r);//69
		
		
		
	    int o=599;
		int g=o--;
		System.out.println(g);//599
		System.out.println(o);//598
		
		
		int e=78;
		int k=--e;
		System.out.println(e);//77
		System.out.println(k);//77
		
		
		int l=350;
		int m=--l;
		System.out.println(l);//349
		System.out.println(m);//349
		
		System.out.println("*****Relation Operators*********");
         //e=k=77, l=m=349, u=v=91,  a2=86,b2=85
		
		System.out.println("Less than <: "+(e<a2));//true
		System.out.println("Greater than >: "+(v>a2));//true
		System.out.println("Less than <: "+(v<b2));//false
		System.out.println("Less than <: "+(l<v));//false 
	
		System.out.println("Less than equal to <=: "+(v<=u));//true
		System.out.println("greater than equal to >=: "+(l>=a2));//true
		System.out.println("compare to value equal to ==: "+(e==k));//true
		System.out.println("compare to value equal to ==: "+(l==b2));//false
		System.out.println("Not equal to !=: "+(e!=k)); //false
		System.out.println("Not equal to !=: "+(a2!=b2));//true
		
		
		System.out.println("*****Logical Operators*********");
		
		
		/*a   b       a&&b(AND)      a||b(or)   !(Not)a
		 * T   T        True            True     False
		 * T   F        False           True      False
		 * F   T        False           True       True
		 * F   F        False           False      True
		 * */
		
		
		//e=k=77, l=m=349, u=v=91,  a2=86,b2=85
		System.out.println("*****And Operators*********");
		System.out.println(e<a2  &&  e==k); //true
		System.out.println(e==k && e>b2); //false
		System.out.println(l<e && e==k); //false
		System.out.println(l!=m && e!=k); //false
		
		
		System.out.println("*****or Operators*********");
		System.out.println(e<a2  ||  e==k); //true
		System.out.println(e==k || e>b2); //true
		System.out.println(l<e || e==k); //true
		System.out.println(l!=m || e!=k); //false
		
		System.out.println("*****not Operators*********");
		System.out.println(e==k); //true
		System.out.println(!(e==k)); //if prvide not so result is false if condition is trues
		System.out.println(e!=k); //false
		System.out.println(!(e!=k)); //true
	
	}

	
	
}
