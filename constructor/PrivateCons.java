										/* Private Constructor */
/*

--> in java, It is possible to erite a constructor as a private 
		but we can't access private member outside the class.

*/


class Box1
{
	int a;
	double b;
	String c;
	
	private Box1()
	{
			a=10;
			b=20.5;
			c="Mer Sagar";
			
			System.out.println("\na --> "+a);
			System.out.println("b --> "+b);
			System.out.println("Name --> "+c);
	}
	
	public static void main(String[] args)
	{
		Box1 b =new Box1();
	}	
}


/*
==========================================
Output:

S:\java\constructor>javac PrivateCons.java

S:\java\constructor>java Box1

a --> 10
b --> 20.5
Name --> Mer Sagar

//--------------------------------------------------------

--*-->if we create class outside the Constructor yhan it create error

class Box1
{
	int a;
	double b;
	String c;
	
	private Box1()
	{
			a=10;
			b=20.5;
			c="Mer Sagar";
			
			System.out.println("\na --> "+a);
			System.out.println("b --> "+b);
			System.out.println("Name --> "+c);
	}	
}
class B
{
	public static void main(String[] args)
	{
		Box1 b =new Box1();
	}
}


S:\java\constructor>javac PrivateCons.java
PrivateCons.java:33: Box1() has private access in Box1
                Box1 b =new Box1();
                        ^
1 error

*/

