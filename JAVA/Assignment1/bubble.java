import java.util.Scanner;

public class bubble {
	public static void main(String[] args)
	{
		int a[] = new int[] {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 Scanner in=new Scanner (System. in);
		 int i,j,temp;
		 for(i=0;i<15;i++)
		 {
			 for(j=0;j<i;j++)
			 {
				 if(a[i]<a[j])
				 {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
		 }
		 System.out.print("Sorted array is:");
		 for(i=0;i<15;i++)
		 {
		System.out.print(" "+a[i]);
		 }
	}

}