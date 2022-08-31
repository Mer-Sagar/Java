							/* Abstract Method */
/*

==*==> Abstract Method : 
	
	--> A Method which contain abstract modifier at the time of declaration 
		is called abstract method.
	
note :- 1) It can only be used in abstract class.
		2) It doesn't contain any body{} and always ends with ";".
		3) Abstract method must be overridden in subclass otherwise
			it will also become abstract class.
		4) When ever the action is comman but implementation are diffrenet
			than we should use abstract method.	

*/

/*
abstract class Programming
{
	public abstract void devloper();
}
class HTML extends Programming
{
	@Override
	public void devloper()
	{
		System.out.println("Tim Berners Lee...");
	}
}
class Java extends Programming
{
	public void devloper()
	{
		System.out.println("James Gosling...");
	}
}
class abs_method
{
	public static void main(String[] args)
	{
		HTML h = new HTML();
		h.devloper();
		
		Java j = new Java();
		j.devloper();
	}
}

*/
/*

Output: 

S:\java\Abstraction>javac abs_method.java

S:\java\Abstraction>java abs_method
Tim Berners Lee...
James Gosling...



*/

/*
 2. call abstract class both method compelsory to call
*/

abstract class Programming
{
	public abstract void devloper();
	public abstract void rank();
}
abstract class HTML extends Programming
{
	@Override
	public void devloper()
	{
		System.out.println("Tim Berners Lee...");
	}
	
}
class Java extends HTML
{
	public void rank()
	{
		System.out.println("2nd");
	}
}
class abs_method
{
	public static void main(String[] args)
	{
		Programming j = new Java();
		j.devloper();
		j.rank();
		
	}
}
/*
Output:

S:\java\Abstraction>javac abs_method.java

S:\java\Abstraction>java abs_method
Tim Berners Lee...
2nd

*/
