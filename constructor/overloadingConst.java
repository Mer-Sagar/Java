										/* Constructor OverLoading */
										
class A6
{
	int a;
	double b;
	String c;
	
	private A6()
	{
		a=100;
		b=2.5;
		c="Mer";
				
	}
	
	A6()
	{
		a=10;
		b=20.5;
		c="Mer Sagar";
				
	}
	A6(int x)
	{
		a=x;
	}
	A6(double y, String z)
	{
		b=y;
		c=z;
	}
}
class B6
{
	public static void main(String[] args)
	{
		A6 obj1 = new A6();
		A6 obj2 = new A6(4);
		A6 obj3 = new A6(78.09,"Sagar");
		
		System.out.println("\na --> "+obj1.a+"\t b --> "+obj1.b+"\t Name --> "+obj1.c);
		System.out.println("\na --> "+obj2.a);
		System.out.println("\nb --> "+obj3.b+"\t Name --> "+obj3.c);
	}
}

/* =======================================================
Output:

S:\java\constructor>javac overloadingConst.java

S:\java\constructor>java B6

a --> 10         b --> 20.5      Name --> Mer Sagar

a --> 4

b --> 78.09      Name --> Sagar


*/
