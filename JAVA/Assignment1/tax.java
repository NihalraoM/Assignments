import java.util.*;
public class tax {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter CTC");
		int CTC=in.nextInt();
		
		int taxp,it;
		if(CTC>=0&&CTC<=180000)
		{
			taxp=0;
			it=tax1(taxp,CTC);
		
		}
	else if(CTC>=181000&&CTC<=300000)
		{
			taxp=10;
			it=tax1(taxp,CTC);
			System.out.println("Tax to be paid for the amount"+CTC+"is"+it);
		}
	else if(CTC>=300001&&CTC<=500000)
		{
			taxp=20;
			it=tax1(taxp,CTC);
			System.out.println("Tax to be paid for the amount"+CTC+"is"+it);
		}
	else if(CTC>=500001&&CTC<=1000000)
	{
		taxp=30;
		it=tax1(taxp,CTC);
		System.out.println("Tax to be paid for the amount"+CTC+"is"+it);
	}
	else
	{
		System.out.println("NO CAses");
	}
		in.close();
	}
	
	public static int tax1(int num1,int num2)
	{ 
		
	int	result=(num1*num2)/100;
		return result;

		

	}
}

