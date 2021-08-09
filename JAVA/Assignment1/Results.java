import java.util.Scanner;
public class Result {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Sub 1 marks:");
		int s1=in.nextInt();
		System.out.println("Enter Sub 2 marks:");
		int s2=in.nextInt();
		System.out.println("Enter Sub 3 marks:");
		int s3=in.nextInt();
		
		if(s1>=60&&s2>=60&s3>=60)
		{
			System.out.println("Passed");
		}
		else if((s1>=60&&s2>=60&&s3<60)||(s3>=60&&s2>=60&&s1<60)||(s1>=60&&s3>=6060&&s2<60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("failed");
		}
		
		
	}

}
