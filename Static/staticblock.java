								/* Static Block */
/* 
	==> Static block is such kind of block in java which get 
			executed at the time of loading the .class file into JVM memory.
		
		staticblock.java --> javac --> static.class ==>in JVM{ class loader -> byte code viewer-> extantion enginee}
		
		--> it runs before instnce block.
		
		--> it only one time execuit.
*/
class A
{
	static
	{
		System.out.println("Static Block Executed.....");
	}			// whitout object it can execute

	public static void main(String[] args)
	{
		A obj =new A();
		
	}	
	
	A()
	{
		System.out.println("Default Constructor Executed.....");
	}			// whitout object it can not execute
	
	{
		System.out.println("Instance Block Executed.....");
	}			// whitout object it can not execute
	
	
}


/* ====================================================
Output : 

S:\java\Static>javac staticblock.java

S:\java\Static>java A
Static Block Executed.....

------------------------------------------------------------------

S:\java\Static>javac staticblock.java

S:\java\Static>java A
Static Block Executed.....
Instance Block Executed.....
Default Constructor Executed.....


*/