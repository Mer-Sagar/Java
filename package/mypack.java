								/* Package */
/*
 ===>Package:
	--> A package arrange number of classes interfaces and 
		 Sub-package of some type into a particular group.
		 
	Note: 
		1) A package is nothing but folder in windows.
		2) two type of package	
			1. Pre-defined : already created by java devloper
				- java.lang   (default : without this we can not run  any single program as well)
				               --> System, String, Object, Integer etc.
				- java.util	  (data structure related classes available in this)
					           --> LinkList, Stack, Vector, Hashset, TreeSet etc.
				- java.io	  (file handling classes)
							   --> FileWriter, File Reader etc.
				- java.applet (web application classes)
				- java.awt	  (web application classes)
							   --> Frame, Button, TextFeild etc.
				- java.net	  (web application classes)
							   --> URL, InetAddress, URLConnection etc.
				- java.sql	  (JDBC related classes)
							   --> Connection, Statment, ResultSet etc.
				- java.swing   --> JFrame, JButton, JTextFeild etc.
				
			2. User-defined : created by user
				- package Package_name;
				- Package Calulator
				- Package Rajkot
					
					rule : 
						a) Package statment must be first line of the program
						b) The way of compilation of these classes whould be diffrent.
							javac -d . Class_name.java
						
			3. Access Modifier:
				
			Access Modifier| within class |  within package |  Outside Package by SubClass | Outside Package 
				Private    |     Yes      |         No      |               No             |           No
				Default    |     Yes      |         Yes     |               No             |           No
				Protected  |     Yes      |         Yes     |               Yes            |           No
				Public     |     Yes      |         Yes     |               Yes            |           Yes
			
			4. Advantage :
					--> Reusability
					--> Security
					--> Fast Searching
					--> Naming Confliting
					--> Hidding
					
			5. Disadvantage :
					--> we can not pass Parameter to the package.
	
 */
 /*
 // 3.1
 
 package package3_1;
 
 class A
 {
	private void show()
	{
		System.out.println("Mer Sagar");
	}
	public static void main(String[] args)
	{
		A r = new A();
		r.show();
	}
 }
*/

/*
===========================================
Output: 

S:\java\package>javac -d . mypack.java

S:\java\package>java package3_1.A
Mer Sagar

*/

/*
 // 3.2
 
package package3_2;
 
class A
{
	void show()
	{
		System.out.println("Class A show method executed...");
	}
}
class B
{
	public static void main(String[] args)
	{
		A r = new A();
		r.show();
	}
 }

*/
/*
===========================================
Output: 

S:\java\package>javac -d . mypack.java

S:\java\package>java package3_2.B
Class A show method executed...


*/



 // 3.3
 
package package3_3;
 
class A
{
	protected void show()
	{
		System.out.println("Class A show method executed...");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		B r = new B();
		r.show();
	}
 }


/*
===========================================
Output: 

S:\java\package>javac -d . mypack.java


S:\java\package>java package3_3.B
Class A show method executed...


*/