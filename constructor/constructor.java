class A
{
	int a;
	String nm;
	
	A()
	{
		a=0;
		nm=null;
	}
	void show()
	{
		System.out.println(a+" "+nm);
	}
 }
class Constructor
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.show();
	}
}

/*
Output: 

S:\java\constructor>javac constructor.java

S:\java\constructor>java Constructor
0 null

*/