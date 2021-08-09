package oops;

class shape{
	void draw()
	{
		System.out.println("draw the shape:");
	}
}
class line{
	void draw()
	{System.out.println("----------");
	}
}

class square{
	void draw()
	{
		System.out.println("----------");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("----------");
}
}

class rectangle{
	void draw()
	{
		System.out.println("----------");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("----------");
	}
}

class cube{
	void draw()
	{
		System.out.println("cube");
	}
}

public class DRAW {
	public static void main(String args[]){
		line l=new line();
		square s=new square();
		rectangle r=new rectangle();
		cube c=new cube();
		l.draw();
		s.draw();
		r.draw();
		c.draw();
		
		
		
	}
}




