package EH;

import java.util.Scanner;

public class EHQuestion1 {
	public static void main(String[] args) {
		try {
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter value of a :");
			int a=sc.nextInt();
			System.out.print("Enter value of b :");
			int b=sc.nextInt();
			int result;
			result=a/b;
			System.out.print("result :"+result);
			sc.close();
			
		} catch (Exception e) {
			
			System.out.println("Denominator is ZERO");
			System.out.println(e);
			
		}
		System.out.println();
		
		System.out.println("it passed below catch");
		
}}
