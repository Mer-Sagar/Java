 						/* Interface Multiple Inheritance */
/*

==> Interface Multiple Inheritance: 
	--> we can achive multiple inharitance through interface because 
		interface contains only abstract method, which implementation
		is provided by the sub classes.
				
*/

interface A
{
	void show();	// public + abstract	
}

interface B
{
	void show();	// public + abstract	
}

class Interface_multi implements A,B
{
	@Override
	public void show()
	{
		System.out.println("Interface A & B");
	}
	public static void main(String[] args)
	{
		Interface_multi m = new Interface_multi();
		
		m.show();
	}	
}
*/
/*

S:\java\Interface>javac interface_multi.java

S:\java\Interface>java Interface_multi
Interface A & B

*/

// 2) Method are diffrent


interface A
{
	void show();	// public + abstract	
}

interface B
{
	void display();	// public + abstract	
}

class Interface_multi implements A,B
{
	public void show()
	{
		System.out.println("Interface A");
	}
	public void display()
	{
		System.out.println("Interface B");
	}
	public static void main(String[] args)
	{
		Interface_multi m = new Interface_multi();
		
		m.show();
		m.display();
	}	
}

/*

S:\java\Interface>javac interface_multi.java

S:\java\Interface>java Interface_multi
Interface A
Interface B


*/

