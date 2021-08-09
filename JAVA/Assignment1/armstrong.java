
public class armstrong {


		public static void main(String[] args)
		{

		int n=153;

		int sum=0,r;
         int temp=n;
		while(n>0)
		{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
		}
		if(temp==sum)
		{
		System.out.println("Given Number is Armstrong Number");
		}
		else
		{
		System.out.println("Given Number is not an Armstrong Number");
		}
		}
}

