								/* Interface */
/*

==> Interface :
	
	--> Interface is just like a class, which contains only abstract method.
	--> To achive interface java provieds keyword called "implements".
	
Note:
	1) Interface methods are by default public & abstract.
	2) Interface variable are by default public, static, final.
	3) Interface method must be overriden inside the implementing classes.
	4) Interface nothing but deals between client & devloper.


*/
import java.util.Scanner;

interface client
{
	void input();	// public + abstract
	void output();	// public + abstract
}
class Sagar implements client
{
	String name;
	double sal;
	
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter User Name : ");
		name = sc.nextLine();
		
		System.out.print("Enter Salary : ");
		sal = sc.nextDouble();
		
	}
	
	public void output()
	{
		System.out.println(name+" -->"+sal);		
	}
	
	public static void main(String[] args)
	{
		client c = new Sagar();		
		c.input();
		c.output();
				
	}
	
}


/*

S:\java\Interface>javac Interface.java

S:\java\Interface>java Sagar
Enter User Name : Mer Sagar
Enter Salary : 20000
Mer Sagar -->20000.0

*/