package StringAsgn;

public class StringBuld2 {
	
	
		public static void main(String[] args)
		{
			StringBuilder str = new StringBuilder ("It is used to _");
			
			StringBuilder  str1= new StringBuilder ("insert text");
		
			System.out.println("before inserting:  "+str);
			str.insert(14, str1);
			System.out.println("after inserting:  "+str);
			
			
		}


}
