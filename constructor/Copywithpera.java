										/* Copy Constructor */
class A
{
	int a,b;
		
	A(int p, int q)
	{
		a=p;
		b=q;
		System.out.println("Sum of two Number is : "+ (p+q) );
	}	
	
	A(A obj1)
	{
		System.out.println("Sum of two Number is : "+ (obj1.a + obj1.b) );
	}	
}										
class Copywithpera
{
	public static void main(String[] args)
	{
		A obj = new A(3,5);
		A obj1 = new A(obj);	
	}	
}

/* ==================================================
Output:

S:\java\constructor>javac Copywithpera.java

S:\java\constructor>java Copywithpera
Sum of two Number is : 8
Sum of two Number is : 8

*/