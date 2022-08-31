								/* Interface Variables */
/*

==> Interface : by default 
				- public 
				- static 
				- final
	
	--> Interface is just like a class, which contains only abstract method.
	--> To achive interface java provieds keyword called "implements".
	
Note:
	1) Interface Variable must be inistilize at declration time
	2) Interface variable are by default public, static, final.

*/
import java.util.Scanner;

interface customerAmit
{
	int amt = 5;		// public + static + final
	void purchese();	// public + abstract	
}
class sellerSagar implements customerAmit
{
	@Override
	public void purchese()
	{
		//amt = 7;   		// error : we can't change variable value.
		System.out.println("Amit needs "+ amt + "kg rice");
	}	
}
class Interface_var 
{
	public static void main(String[] args)
	{
		customerAmit c = new sellerSagar();
		c.purchese();

		System.out.println(customerAmit.amt);		// it is not depend on subclass.
	}	
}

/*

S:\java\Interface>javac Interface_var.java

S:\java\Interface>java Interface_var
Amit needs 5kg rice
5

*/