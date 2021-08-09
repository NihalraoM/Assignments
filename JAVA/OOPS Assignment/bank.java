package oops;

import java.util.Scanner;

class bank1{
	public int amount(int a) {
		return 0;
	}
	
}
class current extends bank1{
	int a;
	public int amount(int a) {
		this.a=a;
		return a;
	}

}
class saving extends bank1{
	int a;
	public int amount(int a) {
		this.a=a;
		return a;	
}
}
public class bank {
	public static void main(String[] args)
	{
		 saving s=new saving();
		  current c=new current();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter save and cur");
		  int save=sc.nextInt();
		  int cur=sc.nextInt();
		  int sum=s.amount(save)+c.amount(cur);
		  System.out.println("total cash in bank:"+sum);
		 
		
	}

}
