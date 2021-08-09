package StringAsgn;

public class StringBuld1 {

	public static void main(String args[])
	{
		StringBuilder str=new StringBuilder("String Builder");
		System.out.println(str);
		str.append(" is identical to string buffer");
		System.out.println(str);
		str.append(" & it is faster");
		System.out.println(str);
		str.append(" but it is not thread safe");
		System.out.println(str);
	}


}
