package StringAsgn;

public class StringBuff3 {
	public static void main(String[] args)
	{
		StringBuffer str = new StringBuffer("This method returns the "
				+ "reversed object on which it was called");
		System.out.println("before rev:  "+str);
		System.out.println();
		str.reverse();
		System.out.println("After rev:  "+str);

}
}
