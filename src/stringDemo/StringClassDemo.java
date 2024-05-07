package stringDemo;

public class StringClassDemo {
	/*
	 * String is an immutable class in java (not able to update object)
	 * java.lang package name
	 * String is collection of character
	 * String we can declared
	 * ==============================
	 * 1. Using literal 
	 * -------------------------
	 * a) Object will create insde SCP (string constant pool)
	 * 
	 * 2. Using new keyword
	 * ---------------------------
	 * a) it will create 2 object in JVM heap memory and SCP area
	 * 
	 * 
	 * 
	 * */
	
	public static void main(String args[])
	{
		String s1="Hello";//scp
		String s2=new String("Hello");//heap of jvm
		//compare for id for JVM so use == not equals method 
		
		System.out.println("Compare s1 and s2 string " +(s1==s2));//false 
		String s3="Hello";//scp
		System.out.println("Compare s1 and s3 string " +(s1==s3));//true
		
		s3 =s3 +  " All";
		System.out.println(s3);
	System.out.println("Compare s1 and s2 string " +(s1==s3));//false
	
	//String Method S3= Hello All
	//length()
	System.out.println("*****Length() method********");
	System.out.println("Length of s3:" +s3.length());
	//toUpperCase() 
	System.out.println("*****toUppercase() method********");
	System.out.println("Uppercase of s3:" +s3.toUpperCase());
	//toLowerCase()
	System.out.println("*****toUppercase() method********");
	System.out.println("LowerCase of s3:" +s3.toLowerCase());
	/*
	 * Equality Between String
	 * 1. equals() case senstive 
	 * 2. equalsIgnoreCase() not case senstive
	 * Method will test /compare object data
	 * == it test ids assigned by JVM
	 * \
	 * */
	System.out.println("*****Equality Between String method********");
	String act="Selenuim WebDriver is webUI automation library";
	String exp="Selenuim WebDriver is WebUI Automation Library";
	System.out.println("Using Equals() "+act.equals(exp));//true
	System.out.println("Using EqualsIgnoreCase() "+act.equalsIgnoreCase(exp));	
	System.out.println("*****Contains()********");
	//Contains partial String
	System.out.println("exp String contains Automation: " +exp.contains("Automation"));
	System.out.println("exp String contains tool: " +exp.contains("tool"));
	System.out.println ("*****startWith() and endWith()********");
	//startWith(prefix value)  endWith(Suufix value)
	System.out.println("exp String Start with Selenuim: " +exp.startsWith ("Selenuim"));
	System.out.println("exp String Start with Se: " +exp.startsWith ("Se"));
	System.out.println("exp String Start with S: " +exp.startsWith ("S"));
	System.out.println("exp String Start with m: " +exp.startsWith ("m"));
	System.out.println("exp String Start with s: " +exp.startsWith ("s "));
    System.out.println("exp String end  with library: " +exp.endsWith("Library"));
	System.out.println("exp String end  with lib: " +exp.endsWith("lib"));//false
	System.out.println("exp String end  with ary: " +exp.endsWith("ary"));
	System.out.println("exp String end  with y: " +exp.endsWith("y"));
	 exp=exp+" Tool";
	 System.out.println("exp String end  with Tool: " +exp.endsWith("Tool"));
	 System.out.println("*****charAt(index)********");
	 //charAt(index)---single character
	 System.out.println("exp String with sing character: " +exp.charAt(0));
	 System.out.println("exp String with sing character: " +exp.charAt(9));
	 System.out.println("*****indexof(char)********");
	 //indexof(char)-- return index of that first occurence character
     System.out.println("exp return the character index " +exp.indexOf('W'));
     System.out.println("*****subString(begin index)********");
	 //subString(begin index)
     System.out.println("exp return 9 index character to ful string: " +exp.substring(9));
     System.out.println("*****subString(begin index, end index)********");
	 //subString(begin index,end index) end :index-1;
     System.out.println("exp return 9 and 11 character between string vale: " +exp.substring(9, 11));
     System.out.println("*****isEmpty()********");
	 //isEmpty()
     System.out.println("s3 is empty string: " +s3.isEmpty());
     String s4="";
     System.out.println("s4 is empty string: " +s4.isEmpty());
     System.out.println("*****trim()********");
	 //trim()-ignore white space before and after string
     String s5="                Welcome All                     ";
     System.out.println(s5);
     System.out.println("s5 is trim: " +s5.trim());
     System.out.println("*****split()********");
	 /*split(regular Expression)-- return string[]
     RE is pattern matching!
     */
     String tools="Selenuim,Appium,Postman,Jmeter";//same data type
     System.out.println(tools);
   String arr[]=  tools.split(",");
   System.out.println(arr[3]);
   for(String s:arr)
   {
	   System.out.println(s);
     
   } 
   
   
   
   String date="March 2024 12"; //not same data type
   System.out.println(date);
   String month= date.split(" ")[0];
   String year= date.split(" ")[1];
   String date2= date.split(" ")[2];
   System.out.println(month);
   System.out.println(year);
   System.out.println(date2);
   
   
   String date1="March2 Aprial3 fEB4"; //same data type
   System.out.println(date1);
   String arr1[]=date1.split(" ");
   System.out.println(arr1[2]);
   for(String s:arr1)
   {
	   System.out.println(s);  
   } 
   String date3="2 3 4"; //same data type
   System.out.println(date3);
   String arr3[]=date3.split(" ");
   System.out.println(arr3[2]);
   for(String s:arr3)
   {
	   System.out.println(s);  
   } 
   String s21="1234";
   for(int i=0;i<s21.length();i++)

   {
	  char ch= s21.charAt(i);
	  System.out.println(ch);
   }
   
   System.out.println("***********concat****************");

   //concat
	String s6="Hi";
	String s7="Bye";
	System.out.println(s6.concat(" "+s7));
	System.out.println(s6+" "+s7);
  
   
   //How to revrse any string without method
   
   
   String course="Java selenuim";
  String rev="";
  for (int i=course.length()-1; i>=0;i--)
  {
	rev=rev+course.charAt(i);

  }   
	System.out.println(rev);
	
//with method
	StringBuilder br=new StringBuilder("Java");
	System.out.println(br);
	br.append(17);
	System.out.println(br);
	System.out.println(br.reverse());
	
	
	
   
	}

}
