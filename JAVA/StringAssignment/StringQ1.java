package StringAsgn;

import java.util.Scanner;
public class StringQ1 {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str = "Hello World";
		int n =str.length();
		String str1;
		System.out.println("Enter str2");
		str1=sc.next();
		int n1=str1.length();
		System.out.println("Str1 length "+n);
		System.out.println("Str2 len "+n1);	
		sc.close();
	}

	

}
