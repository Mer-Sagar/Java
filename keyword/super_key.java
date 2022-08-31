							/* Super Keyword */ 

/*	
==>	Super keyword refers to the objects of Super class. 
		- it is used when we want to call the Super 
		  class Variable, Method & Constructorthrough Sub class object.
		
	-:- Sub class na object through Super class ni property use kari sakay.

	--> whenever the super class & sub class variable and method name both
		are same than it can be used only.
	
	--> To avoid the confusion between super class and sub class variable
		and methods that have same name than we should use Super keyword.
		
	Super : keyword, method, constructor
*/

/* Super variable
class superA
{
	int a=10;
}
class superB extends superA
{
	int a=20;
	void show()
	{
		System.out.println(a);
		System.out.println(super.a);			// same name than use super to 
												//  access perent class property
	}
}
class super_key
{
	public static void main(String[] args)
	{
		superB r = new superB();
		r.show();
	}
}

======================================
output: 

S:\java\keyword>javac super_key.java

S:\java\keyword>java super_key
20
10

*/



/*
//Super Method

class superA
{
	void show()
	{
		System.out.println("Result of class A show method ");			
	}
}
class superB extends superA
{
	
	void show()
	{
		super.show();				// ********
		System.out.println("Result of class B show method ");			
									// same name than use super to 
									//  access perent class property
	}
}
class super_key
{
	public static void main(String[] args)
	{
		superB r = new superB();
		r.show();
	}
}



====================================
output:

S:\java\keyword>javac super_key.java

S:\java\keyword>java super_key
Result of class A show method
Result of class B show method

*/



//Super Constructor

class superA
{
	superA()
	{
		System.out.println("Result of Constructor A ");			
	}
}
class superB extends superA
{	
	superB()
	{
		//super();
		System.out.println("Result of Constructor B ");
	}
}
class super_key
{
	public static void main(String[] args)
	{
		superB r = new superB();
		
	}
}


/*
====================================
output:

S:\java\keyword>javac super_key.java

S:\java\keyword>java super_key
Result of Constructor A
Result of Constructor B
*/