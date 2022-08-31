									/* Default Constructor */
class A
{
	int a;
	String nm;
	boolean c;
	
	/*A()		// default
	{
		a=100;
		nm="Sagar";
		c = true;
	}*/
	void show()
	{
		System.out.println(a+" "+nm+" "+c);
	}
}
class defaultcon
{
	public static void main(String[] args)
	{
		A obj = new A();
		obj.show();
	}
}

/*
======================================================
Output: 

S:\java\constructor>javac defaultcon.java

S:\java\constructor>java defaultcon
100 Sagar true


-----------------------------------------------------
S:\java\constructor>javac defaultcon.java

S:\java\constructor>java defaultcon
0 null false


*/