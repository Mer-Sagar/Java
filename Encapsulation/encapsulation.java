							/* Encapsulation */
/*
==> it is the mechanism through which we can wrapping the data members 
	and member Function of class in a single unit called encapsulation.
	
--> Declare the class variable as a private

--> Declare the class method as a public

--> to access the private variable of other class using get and set method.
*/
class A
{
	private int value;

	public void setValue(int x)
	{
		value = x;
	}
	public int getValue()
	{
		return value;
	}
}
class B
{
	public static void main(String[] args)
	{
		A r = new A();
		
		r.setValue(100);
		System.out.println(r.getValue());
	}
}

/*

Output: 

S:\java\Encapsulation>javac encapsulation.java

S:\java\Encapsulation>java B
100

*/