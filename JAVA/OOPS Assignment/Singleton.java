package oops;
public class Singleton {
	 
    private static Singleton myObj;
     
    static{
        myObj = new Singleton();
    }
     
    private Singleton(){
    	
    }
     
    
    public static Singleton getInstance(){
        return myObj;
    }
     
    
    public void testMe(){
        System.out.println("Capg training ");
    }
     
    
    public static void main(String a[]){
        Singleton ms = getInstance();
        ms.testMe();
    }
}

