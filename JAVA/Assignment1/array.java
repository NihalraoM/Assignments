import java.util.*;
public class array {
	public static void main(String[] args)
	{
		int n,i;
		int[] Arr = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	    Scanner in=new Scanner (System. in);
	    System.out.println("Enter N to search");
	     n=in.nextInt();
	     
	     for(i=0;i<15;i++)
	     {
	    	 if(n==Arr[i])
	    	 {
 System.out.println("The given number is present in array at"+i+"postion");
	    	 }
	     }
	     in.close();
	}

}
