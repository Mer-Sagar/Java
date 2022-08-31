										/* All type of Constructor */
class Box
{
	int a,b;
	float area;
	
	Box()
	{
		a= 10;
		b= 30;
		
		area = a*b;	
	}
		
	Box(int p, int q)
	{
		a=p;
		b=q;
		
		area = a*b;
	}	
	
	Box(Box b2)
	{		
		a= b2.a;
		b= b2.b;
		area = b2.a * b2.b;
	}	
	
	void show()
	{
		System.out.println("\n a : "+a+"\t b : "+b);
		System.out.println(" Area of rectangle is : "+ area);
	}
}										
class AllConst
{
	public static void main(String[] args)
	{
		Box b1 = new Box();
		b1.show();
		
		Box b2 = new Box(5,7);
		b2.show();
		
		Box b3 = new Box(b2);
		b3.show();
			
			
	}	
}

/* ==================================================
Output:

S:\java\constructor>javac all_in_one.java

S:\java\constructor>java AllConst

 a : 10  b : 30
 Area of rectangle is : 300.0

 a : 5   b : 7
 Area of rectangle is : 35.0

 a : 5   b : 7
 Area of rectangle is : 35.0

*/