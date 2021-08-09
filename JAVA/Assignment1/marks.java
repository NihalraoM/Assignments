import java.util.Scanner;

public class marks {
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
	    int [] sub1 =new int[3];
	    System.out.println("Enter marks of sub1 for 3 students");
	    for(int i=0; i<3; i++)  
	    {  
	      
	      sub1[i]=scan.nextInt();  
	    }  
	    int [] sub2 =new int[3];
	    System.out.println("Enter marks of sub2 for 3 students");
	    for(int i=0; i<3; i++)  
	    {  
	      
	      sub2[i]=scan.nextInt();  
	    }  
	    int [] sub3 =new int[3];
	    System.out.println("Enter marks of sub3 for 3 students");
	    for(int i=0; i<3; i++)  
	    {  
	      
	      sub3[i]=scan.nextInt();  
	    }  
	 
	    int [] studentavg =new int[3];
	    int [] studenttotal =new int[3];
	    for(int i=0;i<3;i++)
	    {
	    	studentavg[i]=(sub1[i]+sub2[i]+sub3[i])/3;
	    	studenttotal[i]=(sub1[i]+sub2[i]+sub3[i]);
	    }
	    
	    System.out.println("Enter avg of students");
	    for(int i=0; i<3; i++)  
	    	
	    { 
	    	System.out.println("total marks of 3 subs of student"+i+1+"is"+studenttotal[i]);
	    	System.out.println("avg marks of 3 subs of student"+i+1+"is"+studentavg[i]);
	      
	    }  
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}

}
