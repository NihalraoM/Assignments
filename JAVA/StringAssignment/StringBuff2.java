package StringAsgn;

public class StringBuff2 {
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("It is used to _");
		
		StringBuffer str1= new StringBuffer("insert text");
	
		System.out.println("before inserting:  "+str);
		str.insert(14, str1);
		System.out.println("after inserting:  "+str);
		
		
	}

}
