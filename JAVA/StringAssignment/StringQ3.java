package StringAsgn;

public class StringQ3 {
	public static void main(String[] args)
	{
		String s="Java String pool refers to collection of string which are stored in heap";
        /*
         * we cannot make edits in the original string 
         * so we have to create new 
         */
		String s1,s2,s3,s5;
		Boolean s4;
	s1=s.toLowerCase();
	System.out.println("s1 coverts to lower case:   "+s1);
	System.out.println(" ");
	s2=s.toUpperCase();
	System.out.println("s2 is in upper case:  "+s2);
	System.out.println("");
	s3=s.replace('a', '$');
	System.out.println("s3 replaces all a's with $'s:   "+s3);
	System.out.println("");
	s4=s.contains("collection");
	System.out.println("s4 checks wheater collection is there in string s  "+s4);
	System.out.println("");
	s5="java string pool refers to collection of string which are stored in heap";
	boolean n,m;
	n=s.equals(s5);
	if(n==false)
	{
		System.out.println("s5: are string s and string s5 matches: "+n);
	  System.out.println("They dont match we have to "
	  		+ "use equalsIgnoreCase as there are upper and lower case");
	}
	System.out.println("");
		m=s.equalsIgnoreCase(s5);
		System.out.println("string s and s5 matches irrespetive of cases:  "+m);
	

	
	
	
	
	
	}
	

}
