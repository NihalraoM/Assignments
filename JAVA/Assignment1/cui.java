import java.util.Scanner;
public class cui{
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		
		String username="nihal";
		String password="dontask";
		int count=3;
		String Eu,Ep;
		while(count>0)
		{
		System.out.println("Enter Username:");
		Eu=scan.next();
		System.out.println("Enter Password:");
		Ep=scan.next();
	
		if((Eu.equals(username))&&(Ep.equals(password)))
		{
			System.out.println("welcome:");
			break;
		}
		else
		{
			count--;
			System.out.println("Wrong credentials ,limit rematings:"+count);
			
		}
		}
		
	}

}
