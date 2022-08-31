 						/* Extending Interface */


interface Gill
{
	void add();	// public + abstract	
}

interface Raj extends Gill
{
	void sub();	// public + abstract	
}
class Sagar implements Raj
{
	public void add()
	{
		int a=50,b=6;
		System.out.println("Add method answer : "+(a+b));
	}
	
	public void sub()
	{
		int a=50,b=6;
		System.out.println("Sub method answer : "+(a-b));
	}
}

class Interface_extends 
{	
	public static void main(String[] args)
	{
		Raj r = new Sagar();
	
		r.add();
		r.sub();
	}	
}

/*

S:\java\Interface>javac interface_extend.java

S:\java\Interface>java Interface_extends
Add method answer : 56
Sub method answer : 44

*/

