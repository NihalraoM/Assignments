package oops;

import java.util.Scanner;

class employee{
	static int x,y,z,a,b;
	Scanner sc =new Scanner(System.in);
	
}
class manager extends employee{
	public void salary()
	{
		System.out.println("Incentives:x ,with Salary:y");
		x=sc.nextInt();
		y=sc.nextInt();
	}
	
}
class labour extends employee{
	public void salary()
	{
		System.out.println("Extra money for overtime:x with Salary:y");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
	class total extends employee{
	
		void add()
		{
			
			z=x+y+a+b;
		}
		void result()
		{
			System.out.println("total sal off all employees is"+z);
		}
	}

public class organization {
	public static void main(String[] args)
		{
			manager obj1 = new manager();
			obj1.salary();
			
			labour obj2 = new labour();
			obj2.salary();
			
			total obj3=new total();
			obj3.add();
			obj3.result();			
		}
}

