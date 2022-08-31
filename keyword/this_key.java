							/* This Keyword */
/*

	==> This Keyword : 
			it refers the cuurent object inside a method or constructor.
*/
/*
class thisA
{
	void show()
	{
		System.out.println(this);
	}
	public static void main(String[] args)
	{
		thisA r= new thisA();
		
		System.out.println(r);
		r.show();
	}
}
*/
/*
output:

S:\java\keyword>javac this_key.java

S:\java\keyword>java thisA
thisA@15db9742
thisA@15db9742


class address is same of this variable and refrance variable.
*/



// =============================================
/* 
--> wheneverthe name of incetance and loacal variables both are same than,
	 our runtime enviroment JVM gets confused that which one is local variable 
	 & which one is intance variable, to avoid this problem we should use this keyword.

class thisA
{
	int a;
	
	thisA(int a)
	{
		this.a=a;
	}
	void show()
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		thisA r= new thisA(100);
		r.show();
	}
}

==================================================
output:
S:\java\keyword>javac this_key.java

S:\java\keyword>java thisA
100

*/

/*

3)---> It is also used when we want to call 
		the default constructor of its own class.


class thisA
{
	thisA()
	{
		System.out.println("Default Constructor Execute....");
	}
	thisA(int a)
	{
		this();
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		thisA r= new thisA(100);
	}
}
*/

/*

==================================================
output:
S:\java\keyword>javac this_key.java

S:\java\keyword>java thisA
Default Constructor Execute....
100
*/

/*

4)---> It is also called parameterized Constructor of its own class.

*/
class thisA
{
	thisA()
	{
		this(10);		
	}
	thisA(int a)		// perameterized called by default constructor	
	{		
		System.out.println(a);
	}
	
	public static void main(String[] args)
	{
		thisA r= new thisA(100);
	}
}


/*

==================================================
output:
S:\java\keyword>javac this_key.java

S:\java\keyword>java thisA
100

*/