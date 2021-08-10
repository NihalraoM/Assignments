package Generics;

public class Que3 {
	public static void main(String[] args)
	{
		Integer Array[]= {1,2,3,4,5,6,7,8,9,0};
		
		Place a=new Place();
		a.swap(Array, 3, 7);
		
		
		
	}
	
	static class Place{
		<T> void swap(T[] Array,int place1, int place2)
		{
			T temp = Array[place1];
			Array[place1] = Array[place2];
			Array[place2] = temp;
			
			for (T integer : Array) {
				System.out.print(integer+" ");
			
		}
	}
	}
}


