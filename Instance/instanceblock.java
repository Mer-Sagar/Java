								/* Instance Block */
/* 
	==> Instance block is simmilar to method which has no name, it can be written
		inside a class only but not inside a method						
		
		1--> It alwast execuited before the Cunstructor.
		
		2--> We can use variable only inside the instance block not method.
		
		3--> We write time consuming code inside a instance block like - JDBC connectivity.
	
*/
class A
{
	int a,b;
	
	static void show1()
	{
		System.out.println("Static Method Executed.....");
	}											// Static method : it execuited first when we load .class file at that time it run static method or members. 
	
	void show()
	{
		a=50;
		b=60;
		System.out.println(a +" "+ b);
	}											// Simple method : it execuited Third 
	A()
	{
		a=30;
		b=40;
		System.out.println(a +" "+ b);
	}											// Default Constructor : it execuited Second
	
	{
		a=10;
		b=20;
		System.out.println(a +" "+ b);
	}											// Instance Block :  it execuited First
	
	
}
class B
{
	public static void main(String[] args)
	{
		A.show1();
		A obj = new A();
		obj.show();
	}
	
}

/* ====================================================
Output : 


S:\java\Instance>javac instanceblock.java

S:\java\Instance>java B
10 20
30 40
50 60

------------------------------------------------------------------
S:\java\Instance>javac instanceblock.java

S:\java\Instance>java B
Static Method Executed.....
10 20
30 40
50 60

*/