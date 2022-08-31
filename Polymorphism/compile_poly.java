			/* Method Overloading : Compile time Polymorphism */
/*
==> Early binding or Static Polymorphism:
	--> A polymorphism whih is exists at the time of compiletime is called 
		Compiletime polymorphism, Early binding or static polymorphism.
		
	--> it can access through Method Overloading

===> Method Overloading:
	--> same name but diffrent signatcher

*/

class polA
{
	int add()
	{
		int a=10, b=20,c;
		c=a+b;
		return c;
	}
	void add(int x, int y)
	{
		int c;
		c=x+y;
		System.out.println(c);
	}
	void add(int x, double y)
	{
		double c;
		c=x + y;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
		polA r = new polA();
		
		r.add(100,200);
		r.add(20, 40.30);
		
		int sum = r.add();
		System.out.println(sum);
		
	}
}

/*

output: 
S:\java\Polymorphism>javac compile_poly.java

S:\java\Polymorphism>java polA
30
300
60.3
*/
