package exceptionHandling;

public class ThroKeywordDemo {

	public static void main(String[] args) throws StringIsNullException {
	String s1=null;
			if(s1==null)
			{
				throw new StringIsNullException("String null");
			}
	}

}
