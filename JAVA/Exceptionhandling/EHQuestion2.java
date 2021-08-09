package EH;

import java.util.Scanner;

public class EHQuestion2 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter A :");
			int a=sc.nextInt();
			System.out.print("Enter B :");
			int b=sc.nextInt();
			int res;
			if(b==0)
			{
				throw new UnsupportedOperationException();
			}
			res=a/b;
			System.out.print("result :"+res);
			
			sc.close();
			
		} catch (Exception e) {
			
			System.out.println("Denominator is Zero");
			System.out.println(e);
			
		}
		
		
	}

}
