					/* Hierarchical Inheritance */
class A3
{
	int a,b,c;
	
	void input()
	{
		System.out.println("Result of Class A  ");
	}
	
}
class B3 extends A3
{
	void show()
	{
		System.out.println("Result of Class B ");
	}
}
class C3 extends A3
{
	void display()
	{
		System.out.println("Result of Class C ");
	}
}
class Hierarchical_in 
{
	public static void main(String[] args)
	{
		B3 r = new B3();
		C3 r2 = new C3();
		
		r.input();
		r.show();
		
		r2.input();
		r2.display();
	}
}

/* ==============================================================
  Output:

S:\java\Inheritance>javac Hierarchical_in.java

S:\java\Inheritance>java Hierarchical_in
Result of Class A
Result of Class B
Result of Class A
Result of Class C


*/
