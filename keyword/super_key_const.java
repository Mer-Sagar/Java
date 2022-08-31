/*
//Super Constructor : when it is default constructor

class superA1
{
	superA1()
	{
		System.out.println("Result of Constructor A ");			
	}
}
class superB1 extends superA1
{	
	superB1()
	{
		// --> if perent constructor is default than,
		//		compiler automaticaly takes Super(); [by default it self.]
		//super();			
		System.out.println("Result of Constructor B ");
	}
}
class super_key_const
{
	public static void main(String[] args)
	{
		superB1 r = new superB1();		
	}
}

*/
/*
====================================
output:

S:\java\keyword>javac super_key_const.java

S:\java\keyword>java super_key_const
Result of Constructor A
Result of Constructor B

*/


// =========================================================================

//Super Constructor : when it is Perametrized constructor

class superA1
{
	superA1(int a)
	{
		System.out.println("Result of Constructor A  : "+a);			
	}
}
class superB1 extends superA1
{	
	superB1()
	{
		// --> if perent constructor is perameterized than,
		//		we difine Super(pera) with peramerter;[otherwise it takes an error.]
		super(100);			
		System.out.println("Result of Constructor B ");
	}
}
class super_key_const
{
	public static void main(String[] args)
	{
		superB1 r = new superB1();		
	}
}


/*
====================================
output:

S:\java\keyword>javac super_key_const.java

S:\java\keyword>java super_key_const
Result of Constructor A  : 100
Result of Constructor B

*/
