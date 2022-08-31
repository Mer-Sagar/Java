						/*  Multilevel Inheritance  */
class A2
{
	int a,b,c;
	
	void add()
	{
		a=10;
		b=20;
		
		c=a+b;
		System.out.println("Result of Addition : "+c);
	}
	
	void sub()
	{
		a=10;
		b=20;
		
		c=a+b;
		System.out.println("Result of Substraction : "+c);
	}
}
class B2 extends A2
{
	int a,b,c;
	
	void mul()
	{
		a=10;
		b=20;
		
		c=a*b;
		System.out.println("Result of Multiplication : "+c);
	}
	
	void div()
	{
		a=10;
		b=2;
		
		c=a/b;
		System.out.println("Result of Division : "+c);
	}
}
class C2 extends B2
{
	void rem()
	{
		a=10;
		b=20;
		
		c=a%b;
		System.out.println("Remider of two Numbers : "+c);
	}
}
class Test2
{
	public static void main(String[] args)
	{
		C2 r = new C2();
		r.add();
		r.sub();
		r.mul();
		r.div();
		r.rem();
	}
}

/* ==============================================================
  Output:

S:\java\Inheritance>javac multiple_in.java

S:\java\Inheritance>java Test2
Result of Addition : 30
Result of Substraction : 30
Result of Multiplication : 200
Result of Division : 5
Remider of two Numbers : 10


*/
