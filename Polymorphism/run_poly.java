			/* Method Overriding : Run Time Polymorphism */
/*
==> Early binding or Static Polymorphism:
	--> A polymorphism whih is exists at the time of execution of program 
		is called runtime polymorphism, late binding or Dynamic polymorphism.
		
	--> it can access through Method Overriding and inheritance also.

===> Method Overriding:
	--> same name also diffrent or may have same signatcher

*/
/*
class shape
{
		void draw()
		{
				System.out.println("Draw method of Shape class");
		}
}
class square extends shape
{
	@Override
	void draw()
		{
				System.out.println("Draw method of Square class");
		}
}
class run_poly
{
	
	public static void main(String[] args)
	{
		shape r = new square();
		
		r.draw();
	}
}
*/

/*

output: 
S:\java\Polymorphism>javac run_poly.java

S:\java\Polymorphism>java run_poly
Draw method of Square class


*/


// 2) if method not override

/*
class shape
{
		void draw()				// *********
		{
				System.out.println("Draw method of Shape class");
		}
}
class square extends shape
{
	
	void draw2()				// *********
		{
				System.out.println("Draw method of Square class");
		}
}
class run_poly
{
	
	public static void main(String[] args)
	{
		shape r = new square();			// *********
		
		r.draw();						// *********
	}
}
*/
/*

output: 

S:\java\Polymorphism>javac run_poly.java

S:\java\Polymorphism>java run_poly
Draw method of Shape class


*/

// Using sub class object through access super class method.


class shape
{
		void draw()				// *********
		{
				System.out.println("Draw method of Shape class");
		}
}
class square extends shape
{
	
	void draw()				// *********
		{	
			super.draw();
			System.out.println("Draw method of Square class");
		}
}
class run_poly
{
	
	public static void main(String[] args)
	{
		shape r = new square();			// *********
		
		r.draw();						// *********
	}
}

/*

output: 

S:\java\Polymorphism>javac run_poly.java

S:\java\Polymorphism>java run_poly
Draw method of Shape class
Draw method of Square class



*/