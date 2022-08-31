									/* Perameterized Constructor */
class Apera
{
	int p,q;
	String nm;
	
	Apera(int a, int b)		// Perameterized
	{
		p=a;
		q=b;
	}
	Apera(int a,String b)		// Perameterized
	{
		System.out.println(a+" "+b);
	}
	void show()
	{
		System.out.println(p+" "+q);
	}
}
class peracon
{
	public static void main(String[] args)
	{
		Apera obj = new Apera(100, 200);
		Apera obj1 = new Apera(21, "Sagar");
		obj.show();
	}
}

/*
======================================================
Output: 

S:\java\constructor>javac peracon.java

S:\java\constructor>java peracon
21 Sagar
100 200


*/